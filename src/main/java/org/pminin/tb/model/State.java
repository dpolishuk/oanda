package org.pminin.tb.model;

public enum State {
	WAITING_FOR_TREND, WAITING_FOR_VERTICAL_LINE, WAITING_FOR_FRACTALS, TRADING, ORDER_POSTED, TRADE_OPENED,
	INACTIVE, SUSPENDED, OPEN, CLOSE, CLOSE_WHEN_TRADEABLE;
}