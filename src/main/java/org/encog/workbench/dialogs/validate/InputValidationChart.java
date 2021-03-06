/*
 * Encog(tm) Workbanch v3.1 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2012 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.workbench.dialogs.validate;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import org.encog.workbench.dialogs.training.NetworkAndTrainingDialog;

public class InputValidationChart extends NetworkAndTrainingDialog {
	private static final long serialVersionUID = 3377283752032159041L;

	/**
	 * All available networks to display in the combo box.
	 */
	private final List<String> networks = new ArrayList<String>();

	/**
	 * All available training sets to display in the combo box.
	 */
	private final List<String> trainingSets = new ArrayList<String>();

	/**
	 * Construct the dialog box.
	 * 
	 * @param owner
	 */
	public InputValidationChart() {
		super(false);
		setTitle("Validation Chart");
		setSize(400, 400);
		setLocation(200, 200);
		render();
	}


}
