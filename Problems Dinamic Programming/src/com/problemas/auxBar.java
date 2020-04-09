package com.problemas;

public class auxBar
{
	private int oneMm = 0;
	private int twoMm = 0;
	private int threeMm = 0;
	private int totalGain = 0;
	
	
	public auxBar(int oneMm, int twoMm, int threeMm, int totalGain)
	{
		super();
		this.oneMm = oneMm;
		this.twoMm = twoMm;
		this.threeMm = threeMm;
		this.totalGain = totalGain;
	}
	
	public int getOneMm()
	{
		return oneMm;
	}
	public void setOneMm(int oneMm)
	{
		this.oneMm = oneMm;
	}
	public int getTwoMm()
	{
		return twoMm;
	}
	public void setTwoMm(int twoMm)
	{
		this.twoMm = twoMm;
	}
	public int getThreeMm()
	{
		return threeMm;
	}
	public void setThreeMm(int threeMm)
	{
		this.threeMm = threeMm;
	}
	public int getTotalGain()
	{
		return totalGain;
	}
	public void setTotalGain(int totalGain)
	{
		this.totalGain = totalGain;
	}
	@Override
	public String toString()
	{
		return "auxBar [oneMm=" + oneMm + ", twoMm=" + twoMm + ", threeMm=" + threeMm + ", totalGain=" + totalGain
				+ "]";
	}
	
}
