/**
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.simpleSQL.impl;

import kcl.mdd.cw.sql.simpleSQL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSQLFactoryImpl extends EFactoryImpl implements SimpleSQLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleSQLFactory init()
  {
    try
    {
      SimpleSQLFactory theSimpleSQLFactory = (SimpleSQLFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleSQLPackage.eNS_URI);
      if (theSimpleSQLFactory != null)
      {
        return theSimpleSQLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleSQLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSQLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimpleSQLPackage.MODEL: return createModel();
      case SimpleSQLPackage.STATEMENT: return createStatement();
      case SimpleSQLPackage.SELECT: return createSELECT();
      case SimpleSQLPackage.UPDATE: return createUPDATE();
      case SimpleSQLPackage.DELETE: return createDELETE();
      case SimpleSQLPackage.CREATE_DB: return createCREATE_DB();
      case SimpleSQLPackage.CREATE_TABLE: return createCREATE_TABLE();
      case SimpleSQLPackage.COLUMN_DEF: return createCOLUMN_DEF();
      case SimpleSQLPackage.INSERT: return createINSERT();
      case SimpleSQLPackage.INSERT_LIST: return createInsert_List();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SimpleSQLPackage.TYPE:
        return createTYPEFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SimpleSQLPackage.TYPE:
        return convertTYPEToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SELECT createSELECT()
  {
    SELECTImpl select = new SELECTImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UPDATE createUPDATE()
  {
    UPDATEImpl update = new UPDATEImpl();
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DELETE createDELETE()
  {
    DELETEImpl delete = new DELETEImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CREATE_DB createCREATE_DB()
  {
    CREATE_DBImpl creatE_DB = new CREATE_DBImpl();
    return creatE_DB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CREATE_TABLE createCREATE_TABLE()
  {
    CREATE_TABLEImpl creatE_TABLE = new CREATE_TABLEImpl();
    return creatE_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public COLUMN_DEF createCOLUMN_DEF()
  {
    COLUMN_DEFImpl columN_DEF = new COLUMN_DEFImpl();
    return columN_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public INSERT createINSERT()
  {
    INSERTImpl insert = new INSERTImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert_List createInsert_List()
  {
    Insert_ListImpl insert_List = new Insert_ListImpl();
    return insert_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE createTYPEFromString(EDataType eDataType, String initialValue)
  {
    TYPE result = TYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSQLPackage getSimpleSQLPackage()
  {
    return (SimpleSQLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleSQLPackage getPackage()
  {
    return SimpleSQLPackage.eINSTANCE;
  }

} //SimpleSQLFactoryImpl
