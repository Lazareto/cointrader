// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: TypeSafeEnumeration.vsl in andromda-java-cartridge.
// Model Class: Data::AlgoTrader::com.algoTrader::enumeration::Status
// Metafacade: org.andromda.metafacades.uml.Enumeration
// Stereotype: Enumeration
//
package org.cryptocoinpartners.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public enum FillType {

	/** Order stays open until explicitly cancelled or expired */
	GOOD_TIL_CANCELLED("GOOD_TIL_CANCELLED"),
	/** Order stays open until explicitly cancelled, expired, or the order is filled to the capacity of the currently available Positions */
	GTC_OR_MARGIN_CAP("GTC_OR_MARGIN_CAP"),
	/** This will cancel any remaining volume after a partial fill */
	CANCEL_REMAINDER("CANCEL_REMAINDER"),
	/** Order stays open until quanity is filled at limit price or better */
	LIMIT("LIMIT"),
	/** This will trigger a limit order at the specficed stop price */
	STOP_LIMIT("STOP_LIMIT"),
	/** TThis will trigger a limit order at the specficed stop price and will move the stop price by the trailing stop ammount as the price changes */
	TRAILING_STOP_LIMIT("TRAILING_STOP_LIMIT"),
	/** This place a limit order and will limit losses on the filled order by selling at the stop price */
	STOP_LOSS("STOP_LOSS");

	private final String enumValue;

	/**
	 * The constructor with enumeration literal value allowing
	 * super classes to access it.
	 */
	private FillType(String value) {
		this.enumValue = value;
	}

	/**
	 * Retrieves an instance of Status from <code>its name</code>.
	 *
	 * @param name the name to create the Status from.
	 * @return The enumeration literal named after the 'name' argument
	 */
	public static FillType fromString(String name) {
		return FillType.valueOf(name);
	}

	/**
	 * Returns an enumeration literal String <code>value</code>.
	 * Required by JAXB2 enumeration implementation
	 *
	 * @return String with corresponding value
	 */
	public String value() {
		return this.enumValue;
	}

	/**
	 * Returns an instance of Status from String <code>value</code>.
	 * Required by JAXB2 enumeration implementation
	 *
	 * @param value the value to create the Status from.
	 * @return static Enumeration with corresponding value
	 */
	public static FillType fromValue(String value) {
		for (FillType enumName : FillType.values()) {
			if (enumName.getValue().equals(value)) {
				return enumName;
			}
		}
		throw new IllegalArgumentException("Status.fromValue(" + value + ')');
	}

	/**
	 * Gets the underlying value of this type safe enumeration.
	 * This method is necessary to comply with DaoBase implementation.
	 * @return The name of this literal.
	 */
	public String getValue() {
		return this.enumValue;
	}

	/**
	 * Returns an unmodifiable list containing the literals that are known by this enumeration.
	 *
	 * @return A List containing the actual literals defined by this enumeration, this list
	 *         can not be modified.
	 */
	public static List<String> literals() {
		return FillType.literals;
	}

	/**
	 * Returns an unmodifiable list containing the names of the literals that are known
	 * by this enumeration.
	 *
	 * @return A List containing the actual names of the literals defined by this
	 *         enumeration, this list can not be modified.
	 */
	public static List<String> names() {
		return FillType.names;
	}

	private static Map<String, FillType> values = new LinkedHashMap<String, FillType>(7, 1);
	private static List<String> literals = new ArrayList<String>(7);
	private static List<String> names = new ArrayList<String>(7);
	private static List<FillType> valueList = new ArrayList<FillType>(7);

	/**
	 * Initializes the values.
	 */
	static {
		synchronized (FillType.values) {
			FillType.values.put(GOOD_TIL_CANCELLED.enumValue, GOOD_TIL_CANCELLED);
			FillType.values.put(GTC_OR_MARGIN_CAP.enumValue, GTC_OR_MARGIN_CAP);
			FillType.values.put(CANCEL_REMAINDER.enumValue, CANCEL_REMAINDER);
			FillType.values.put(LIMIT.enumValue, LIMIT);
			FillType.values.put(STOP_LIMIT.enumValue, STOP_LIMIT);
			FillType.values.put(TRAILING_STOP_LIMIT.enumValue, TRAILING_STOP_LIMIT);
			FillType.values.put(STOP_LOSS.enumValue, STOP_LOSS);

		}
		synchronized (FillType.valueList) {
			FillType.valueList.add(GOOD_TIL_CANCELLED);
			FillType.valueList.add(GTC_OR_MARGIN_CAP);
			FillType.valueList.add(CANCEL_REMAINDER);
			FillType.valueList.add(LIMIT);
			FillType.valueList.add(STOP_LIMIT);
			FillType.valueList.add(TRAILING_STOP_LIMIT);
			FillType.valueList.add(STOP_LOSS);
			FillType.valueList = Collections.unmodifiableList(valueList);
		}
		synchronized (FillType.literals) {
			FillType.literals.add(GOOD_TIL_CANCELLED.enumValue);
			FillType.literals.add(GTC_OR_MARGIN_CAP.enumValue);
			FillType.literals.add(CANCEL_REMAINDER.enumValue);
			FillType.literals.add(LIMIT.enumValue);
			FillType.literals.add(STOP_LIMIT.enumValue);
			FillType.literals.add(TRAILING_STOP_LIMIT.enumValue);
			FillType.literals.add(STOP_LOSS.enumValue);
			FillType.literals = Collections.unmodifiableList(literals);
		}
		synchronized (FillType.names) {
			FillType.names.add("GOOD_TIL_CANCELLED");
			FillType.names.add("GTC_OR_MARGIN_CAP");
			FillType.names.add("CANCEL_REMAINDER");
			FillType.names.add("LIMIT");
			FillType.names.add("STOP_LIMIT");
			FillType.names.add("TRAILING_STOP_LIMIT");
			FillType.names.add("STOP_LOSS");
			FillType.names = Collections.unmodifiableList(names);
		}
	}
	// type-safe-enumeration-object java merge-point
}
