package designpatterns.hf.behavioural.strategy.operation.pattern;


public class OperationAdd implements OperationStrategy {

	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
