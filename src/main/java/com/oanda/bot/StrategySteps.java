package com.oanda.bot;

import com.oanda.bot.constants.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StrategySteps {
	private static final Logger log = LoggerFactory.getLogger(StrategySteps.class);
	private Step trendStep;
	private Step tradingStep;

	@Autowired
	public StrategySteps(@Value("${main.trendStep}") String trendStep, @Value("${main.tradingStep}") String tradingStep) {
		this.trendStep = Step.valueOf(trendStep);
		this.tradingStep = Step.valueOf(tradingStep);
		log.info(String.format("Strategy steps are: %s and %s", tradingStep(), trendStep()));
	}

	public Step tradingStep() {
		return tradingStep;
	}

	public Step trendStep() {
		return trendStep;
	}
}
