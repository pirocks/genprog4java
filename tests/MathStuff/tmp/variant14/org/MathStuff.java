package org;

import java.util.*;
import java.math.*;

public class MathStuff
{
	public int gcd(int a, int b)
	{
		{
		}
		if (a == 0) {
			b = b - a;
		}
		else
		{
			while (b != 0) {
				result = b;
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
		}
		result=a;	
		return result;
	}
}
