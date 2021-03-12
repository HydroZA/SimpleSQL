/**
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.simpleSQL.impl;

import java.util.Collection;

import kcl.mdd.cw.sql.simpleSQL.COLUMN_DEF;
import kcl.mdd.cw.sql.simpleSQL.CREATE_DB;
import kcl.mdd.cw.sql.simpleSQL.CREATE_TABLE;
import kcl.mdd.cw.sql.simpleSQL.SimpleSQLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CREATE TABLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.impl.CREATE_TABLEImpl#getName <em>Name</em>}</li>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.impl.CREATE_TABLEImpl#getDb <em>Db</em>}</li>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.impl.CREATE_TABLEImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CREATE_TABLEImpl extends StatementImpl implements CREATE_TABLE
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDb() <em>Db</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDb()
   * @generated
   * @ordered
   */
  protected CREATE_DB db;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<COLUMN_DEF> columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CREATE_TABLEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleSQLPackage.Literals.CREATE_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSQLPackage.CREATE_TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CREATE_DB getDb()
  {
    if (db != null && db.eIsProxy())
    {
      InternalEObject oldDb = (InternalEObject)db;
      db = (CREATE_DB)eResolveProxy(oldDb);
      if (db != oldDb)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleSQLPackage.CREATE_TABLE__DB, oldDb, db));
      }
    }
    return db;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CREATE_DB basicGetDb()
  {
    return db;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDb(CREATE_DB newDb)
  {
    CREATE_DB oldDb = db;
    db = newDb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSQLPackage.CREATE_TABLE__DB, oldDb, db));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<COLUMN_DEF> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<COLUMN_DEF>(COLUMN_DEF.class, this, SimpleSQLPackage.CREATE_TABLE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleSQLPackage.CREATE_TABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleSQLPackage.CREATE_TABLE__NAME:
        return getName();
      case SimpleSQLPackage.CREATE_TABLE__DB:
        if (resolve) return getDb();
        return basicGetDb();
      case SimpleSQLPackage.CREATE_TABLE__COLUMNS:
        return getColumns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleSQLPackage.CREATE_TABLE__NAME:
        setName((String)newValue);
        return;
      case SimpleSQLPackage.CREATE_TABLE__DB:
        setDb((CREATE_DB)newValue);
        return;
      case SimpleSQLPackage.CREATE_TABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends COLUMN_DEF>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleSQLPackage.CREATE_TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimpleSQLPackage.CREATE_TABLE__DB:
        setDb((CREATE_DB)null);
        return;
      case SimpleSQLPackage.CREATE_TABLE__COLUMNS:
        getColumns().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleSQLPackage.CREATE_TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimpleSQLPackage.CREATE_TABLE__DB:
        return db != null;
      case SimpleSQLPackage.CREATE_TABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CREATE_TABLEImpl
