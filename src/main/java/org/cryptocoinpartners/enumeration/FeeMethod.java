package org.cryptocoinpartners.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

/**
 * 
 */
public enum FeeMethod {
	PercentagePerUnit("PercentagePerUnit"), PerUnit("PerUnit"), ;

	private final String enumValue;

	private FeeMethod(String value) {
		this.enumValue = value;
	}

	@Transient
	public static FeeMethod fromString(String name) {
		return FeeMethod.valueOf(name);
	}

	@Transient
	public String value() {
		return this.enumValue;
	}

	public static FeeMethod fromValue(String value) {
		for (FeeMethod enumName : FeeMethod.values()) {
			if (enumName.getValue().equals(value)) {
				return enumName;
			}
		}
		throw new IllegalArgumentException("FeeMethod.fromValue(" + value + ')');
	}

	@Transient
	public String getValue() {
		return this.enumValue;
	}

	@Transient
	public static List<String> literals() {
		return FeeMethod.literals;
	}

	@Transient
	public static List<String> names() {
		return FeeMethod.names;
	}

	private static Map<String, FeeMethod> values = new LinkedHashMap<>(9, 1);
	private static List<String> literals = new ArrayList<>(9);
	private static List<String> names = new ArrayList<>(9);
	private static List<FeeMethod> valueList = new ArrayList<>(9);

	/**
	 * Initializes the values.
	 */
	static {
		synchronized (FeeMethod.values) {
			FeeMethod.values.put(PercentagePerUnit.enumValue, PercentagePerUnit);
			FeeMethod.values.put(PerUnit.enumValue, PerUnit);

		}
		synchronized (FeeMethod.valueList) {
			FeeMethod.valueList.add(PercentagePerUnit);
			FeeMethod.valueList.add(PerUnit);

			FeeMethod.valueList = Collections.unmodifiableList(valueList);
		}
		synchronized (FeeMethod.literals) {
			FeeMethod.literals.add(PercentagePerUnit.enumValue);
			FeeMethod.literals.add(PerUnit.enumValue);

			FeeMethod.literals = Collections.unmodifiableList(literals);
		}
		synchronized (FeeMethod.names) {
			FeeMethod.names.add("PercentagePerUnit");
			FeeMethod.names.add("PerUnit");

			FeeMethod.names = Collections.unmodifiableList(names);
		}
	}

}
