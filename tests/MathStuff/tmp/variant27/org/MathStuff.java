package org;

import java.util.*;
import java.math.*;

public class MathStuff
{
	public int gcd(int a, int b)
	{
		b = b - a;
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
		{
			result = a;
			{
				result = b;
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
		}	
		return result;
	}
}
