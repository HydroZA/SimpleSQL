/**
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import kcl.mdd.cw.sql.simpleSQL.COLUMN_DEF;
import kcl.mdd.cw.sql.simpleSQL.CREATE_DB;
import kcl.mdd.cw.sql.simpleSQL.CREATE_TABLE;
import kcl.mdd.cw.sql.simpleSQL.DELETE;
import kcl.mdd.cw.sql.simpleSQL.INSERT;
import kcl.mdd.cw.sql.simpleSQL.Model;
import kcl.mdd.cw.sql.simpleSQL.SELECT;
import kcl.mdd.cw.sql.simpleSQL.Statement;
import kcl.mdd.cw.sql.simpleSQL.TYPE;
import kcl.mdd.cw.sql.simpleSQL.UPDATE;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SimpleSQLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), 
      this.doGenerate(model));
  }
  
  public String deriveTargetFileNameFor(final Model model, final Resource resource) {
    return resource.getURI().appendFileExtension(".sql").lastSegment();
  }
  
  public String doGenerate(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _statements = m.getStatements();
      for(final Statement s : _statements) {
        String _generate = this.generate(s);
        _builder.append(_generate);
        _builder.newLineIfNotEmpty();
        _builder.append("\\n");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  protected String _generate(final INSERT ct) {
    return "";
  }
  
  protected String _generate(final DELETE ct) {
    return "";
  }
  
  protected String _generate(final UPDATE ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generate(final SELECT ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT ");
    String _xifexpression = null;
    String _name = ct.getName();
    boolean _equals = Objects.equal(_name, "all");
    if (_equals) {
      _xifexpression = "*";
    } else {
      _xifexpression = ct.getName();
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("FROM ");
    String _table = ct.getTable();
    _builder.append(_table);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generate(final CREATE_TABLE ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _name = ct.getName();
    _builder.append(_name);
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    {
      EList<COLUMN_DEF> _columns = ct.getColumns();
      boolean _hasElements = false;
      for(final COLUMN_DEF col : _columns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name_1 = col.getName();
        _builder.append(_name_1);
        _builder.append(" ");
        Object _xifexpression = null;
        TYPE _type = col.getType();
        boolean _equals = Objects.equal(_type, "string");
        if (_equals) {
          _xifexpression = "VARCHAR(255)";
        } else {
          _xifexpression = col.getType();
        }
        _builder.append(_xifexpression);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generate(final CREATE_DB cd) {
    String _name = cd.getName();
    return ("CREATE DATABASE " + _name);
  }
  
  public String generate(final Statement cd) {
    if (cd instanceof CREATE_DB) {
      return _generate((CREATE_DB)cd);
    } else if (cd instanceof CREATE_TABLE) {
      return _generate((CREATE_TABLE)cd);
    } else if (cd instanceof DELETE) {
      return _generate((DELETE)cd);
    } else if (cd instanceof INSERT) {
      return _generate((INSERT)cd);
    } else if (cd instanceof SELECT) {
      return _generate((SELECT)cd);
    } else if (cd instanceof UPDATE) {
      return _generate((UPDATE)cd);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cd).toString());
    }
  }
}
