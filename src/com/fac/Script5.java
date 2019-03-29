package com.fac;

import org.testng.annotations.Test;

public class Script5 
{
	@Test(priority=1)
	public void b_method()
	{
		System.out.println("b got executed");
	}
	@Test(priority=0)
	public void d_method()
	{
		System.out.println("d got executed");
	}
	@Test(priority=33)
	public void c_method()
	{
		System.out.println("c got executed");
	}
	@Test(priority=96)
	public void a_method()
	{
		System.out.println("a got executed");
	}

}
