package org;

import java.util.*;
import java.math.*;

public class MathStuff
{
	public int gcd(int a, int b)
	{
		int result = 1;
		if (a == 0) {
			{
				b = b - a;
				b = b - a;
			}
		}
		else
		{
			while (b != 0)
				a = a - b;
		}
		result=a;	
		return result;
	}
}
