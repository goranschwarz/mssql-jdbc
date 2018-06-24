/*
 * Microsoft JDBC Driver for SQL Server
 * 
 * Copyright(c) Microsoft Corporation All rights reserved.
 * 
 * This program is made available under the terms of the MIT License. See the LICENSE file in the project root for more information.
 */

package com.microsoft.sqlserver.jdbc.dataclassification;

import java.util.ArrayList;
import java.util.List;

/**
 * This class retrieves Sensitivity Classification data as recieved from SQL
 * Server for the active resultSet
 */
public class SensitivityClassification {
	private List<Label> labels;
	private List<InformationType> informationTypes;
	private List<ColumnSensitivity> columnSensitivities;

	// Creating new ArrayList here assures that 'informationTypes' and 'labels'
	// properties will not be null.
	// The Count of the ColumnSensitivities property will be equal to the number
	// of output columns for the query result set.
	/**
	 * Constructor for <code>SensitivityClassification</code> Object
	 * 
	 * @param labels
	 *            Labels as received from SQL Server
	 * @param informationTypes
	 *            Information Types as received from SQL Server
	 * @param columnSensitivity
	 *            Column Sensitivities as received from SQL Server
	 */
	public SensitivityClassification(List<Label> labels,
			List<InformationType> informationTypes,
			List<ColumnSensitivity> columnSensitivity) {
		this.labels = new ArrayList<Label>(labels);
		this.informationTypes = new ArrayList<InformationType>(
				informationTypes);
		this.columnSensitivities = new ArrayList<ColumnSensitivity>(
				columnSensitivity);
	}

	/**
	 * Retrieves Labels for this <code>SensitivityClassification</code> Object
	 * 
	 * @return labels
	 */
	public List<Label> getLabels() {
		return labels;
	}

	/**
	 * Retrieves Information Types for this
	 * <code>SensitivityClassification</code> Object
	 * 
	 * @return informationTypes
	 */
	public List<InformationType> getInformationTypes() {
		return informationTypes;
	}

	/**
	 * Retrieves Column Sensitivity for this
	 * <code>SensitivityClassification</code> Object
	 * 
	 * @return columnSensitivities
	 */
	public List<ColumnSensitivity> getColumnSensitivities() {
		return columnSensitivities;
	}
}
