/**
 */
package whisky.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import whisky.Herkunft;
import whisky.WhiskyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herkunft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link whisky.impl.HerkunftImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link whisky.impl.HerkunftImpl#getLand <em>Land</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerkunftImpl extends MinimalEObjectImpl.Container implements Herkunft {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected static final String LAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected String land = LAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerkunftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WhiskyPackage.Literals.HERKUNFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.HERKUNFT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLand() {
		return land;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLand(String newLand) {
		String oldLand = land;
		land = newLand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WhiskyPackage.HERKUNFT__LAND, oldLand, land));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WhiskyPackage.HERKUNFT__REGION:
			return getRegion();
		case WhiskyPackage.HERKUNFT__LAND:
			return getLand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WhiskyPackage.HERKUNFT__REGION:
			setRegion((String) newValue);
			return;
		case WhiskyPackage.HERKUNFT__LAND:
			setLand((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case WhiskyPackage.HERKUNFT__REGION:
			setRegion(REGION_EDEFAULT);
			return;
		case WhiskyPackage.HERKUNFT__LAND:
			setLand(LAND_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WhiskyPackage.HERKUNFT__REGION:
			return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
		case WhiskyPackage.HERKUNFT__LAND:
			return LAND_EDEFAULT == null ? land != null : !LAND_EDEFAULT.equals(land);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (region: ");
		result.append(region);
		result.append(", land: ");
		result.append(land);
		result.append(')');
		return result.toString();
	}

} //HerkunftImpl
