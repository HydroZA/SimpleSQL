/**
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.simpleSQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CREATE DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.mdd.cw.sql.simpleSQL.CREATE_DB#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kcl.mdd.cw.sql.simpleSQL.SimpleSQLPackage#getCREATE_DB()
 * @model
 * @generated
 */
public interface CREATE_DB extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kcl.mdd.cw.sql.simpleSQL.SimpleSQLPackage#getCREATE_DB_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kcl.mdd.cw.sql.simpleSQL.CREATE_DB#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // CREATE_DB
