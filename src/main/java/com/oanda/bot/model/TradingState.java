package com.oanda.bot.model;

public interface TradingState {
	Candle getCurrentRate();

	Candle getLastBrokenFractal30M();

	Candle getLastBrokenFractal5MOpp();

	Candle getLastConfirmedFractal5M();

	Candle getLastConfirmedFractal5MOpp();

	int getMarketDirection();
}
