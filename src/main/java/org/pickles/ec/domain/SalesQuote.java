package org.pickles.ec.domain;

public class SalesQuote {

	private LineList lineList;

	private ShippingCost shippingCost;

	private TaxRate taxRate;

	public SalesQuote(LineList lineList, ShippingCost shippingCost, TaxRate taxRate) {
		this.lineList = lineList;
	}

	public void 小計() {
	}

	public void 配送料() {
	}

	public void 税額() {
	}

	public void 合計() {
	}
}
