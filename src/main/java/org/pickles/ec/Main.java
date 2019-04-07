package org.pickles.ec;

import org.pickles.ec.domain.SalesQuote;

public class Main {

	public static void main(String[] args) {

		SalesQuote salesQuote = new SalesQuote(lineList, shippingCost, taxRate);

		salesQuote.小計();
		salesQuote.配送料();
		salesQuote.税額();
		salesQuote.合計();

	}
}
