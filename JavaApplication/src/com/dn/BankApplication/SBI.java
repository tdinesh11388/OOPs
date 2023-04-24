package com.dn.BankApplication;

import java.math.BigDecimal;

public class SBI extends Bank
{
	@Override
	public double rateOfIntrest()
	{
		return 0.09;
	}
}
class ICICI extends Bank
{
	@Override
	public double rateOfIntrest()
	{
		return 0.015;
	}
}
class BOI extends Bank
{
	@Override
	public double rateOfIntrest()
	{
		return 0.012;
	}
}