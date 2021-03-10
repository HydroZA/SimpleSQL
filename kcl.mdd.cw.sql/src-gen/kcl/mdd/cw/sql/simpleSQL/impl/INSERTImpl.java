/**
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.simpleSQL.impl;

import java.util.Collection;

import kcl.mdd.cw.sql.simpleSQL.CREATE_TABLE;
import kcl.mdd.cw.sql.simpleSQL.INSERT;
import kcl.mdd.cw.sql.simpleSQL.Insert_List;
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
 * An implementation of the model object '<em><b>INSERT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.impl.INSERTImpl#getTable <em>Table</em>}</li>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.impl.INSERTImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INSERTImpl extends StatementImpl implements INSERT
{
  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected CREATE_TABLE table;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EList<Insert_List> data;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected INSERTImpl()
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
    return SimpleSQLPackage.Literals.INSERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CREATE_TABLE getTable()
  {
    if (table != null && table.eIsProxy())
    {
      InternalEObject oldTable = (InternalEObject)table;
      table = (CREATE_TABLE)eResolveProxy(oldTable);
      if (table != oldTable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleSQLPackage.INSERT__TABLE, oldTable, table));
      }
    }
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CREATE_TABLE basicGetTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTable(CREATE_TABLE newTable)
  {
    CREATE_TABLE oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSQLPackage.INSERT__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Insert_List> getData()
  {
    if (data == null)
    {
      data = new EObjectContainmentEList<Insert_List>(Insert_List.class, this, SimpleSQLPackage.INSERT__DATA);
    }
    return data;
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
      case SimpleSQLPackage.INSERT__DATA:
        return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
      case SimpleSQLPackage.INSERT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case SimpleSQLPackage.INSERT__DATA:
        return getData();
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
      case SimpleSQLPackage.INSERT__TABLE:
        setTable((CREATE_TABLE)newValue);
        return;
      case SimpleSQLPackage.INSERT__DATA:
        getData().clear();
        getData().addAll((Collection<? extends Insert_List>)newValue);
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
      case SimpleSQLPackage.INSERT__TABLE:
        setTable((CREATE_TABLE)null);
        return;
      case SimpleSQLPackage.INSERT__DATA:
        getData().clear();
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
      case SimpleSQLPackage.INSERT__TABLE:
        return table != null;
      case SimpleSQLPackage.INSERT__DATA:
        return data != null && !data.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //INSERTImpl
