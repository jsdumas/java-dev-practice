package designpatterns.hf.behavioural.strategy.operation.app;

import designpatterns.hf.behavioural.strategy.operation.pattern.OperationContext;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationAdd;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationMultiply;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationSubstract;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		OperationContext operationContext = new OperationContext(new OperationAdd());
		System.out.println("10 + 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationSubstract());
		System.out.println("10 - 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationMultiply());
		System.out.println("10 * 5 = " + operationContext.executeStrategy(10, 5));
	}

}
