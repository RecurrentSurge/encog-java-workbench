package org.encog.workbench.dialogs.createnetwork;

import java.awt.Frame;

import org.encog.workbench.EncogWorkBench;
import org.encog.workbench.dialogs.common.BuildingListField;
import org.encog.workbench.dialogs.common.BuildingListListener;
import org.encog.workbench.dialogs.common.EncogPropertiesDialog;
import org.encog.workbench.dialogs.common.IntegerField;

public class CreateFeedforward extends EncogPropertiesDialog implements
		BuildingListListener {

	private IntegerField inputCount;
	private IntegerField outputCount;
	private BuildingListField hidden;

	public CreateFeedforward(Frame owner) {
		super(owner);
		setTitle("Create Elman Network");
		setSize(600, 400);
		setLocation(200, 200);
		addProperty(this.inputCount = new IntegerField("input neurons",
				"Input Neuron Count", true, 1, -1));
		addProperty(this.hidden = new BuildingListField("hidden neurons",
				"Hidden Layer Counts"));
		addProperty(this.outputCount = new IntegerField("output neurons",
				"Output Neuron Count", true, 1, -1));
		render();
	}

	public IntegerField getInputCount() {
		return inputCount;
	}

	public IntegerField getOutputCount() {
		return outputCount;
	}

	private String askNeurons(int layer) {
		String str = EncogWorkBench
				.displayInput("How many neurons for hidden layer " + layer
						+ "?");
		if (str == null)
			return null;
		else
		{
			try
			{
				str = "Hidden Layer " + layer + ": " + Integer.parseInt(str.trim()) + " neurons";	
			}
			catch(NumberFormatException e)
			{
				EncogWorkBench.displayError("Error", "Enter a valid number.");
				return null;
			}
		}
			

		return str;
	}

	public void add(BuildingListField list, int index) {

		String str = askNeurons(list.getModel().size() + 1);
		if (str != null) {
			list.getModel().addElement(str);
		}

	}

	public void del(BuildingListField list, int index) {
		if (index != -1) {
			list.getModel().remove(index);
		}
	}

	public void edit(BuildingListField list, int index) {
		if (index != -1) {
			String str = askNeurons(index+1);
			if (str != null) {
				list.getModel().remove(index);
				list.getModel().add(index, str);
			}
		}
	}

	public BuildingListField getHidden() {
		return hidden;
	}
	
	

}