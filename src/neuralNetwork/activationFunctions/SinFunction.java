package neuralNetwork.activationFunctions;

public class SinFunction implements Activation {

	@Override
	public Double activation(Double inp) {
		return Math.sin(inp);

	}

	@Override
	public double activationDifferential(Double input, Double outputResult) {
		return Math.cos(input);
	}

}
