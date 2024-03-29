package edu.uncc.parsets.util;

import java.awt.Color;
import java.awt.Graphics;


/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\
 * Copyright (c) 2009, Robert Kosara, Caroline Ziemkiewicz,
 *                     and others (see Authors.txt for full list)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of UNC Charlotte nor the names of its contributors
 *      may be used to endorse or promote products derived from this software
 *      without specific prior written permission.
 *      
 * THIS SOFTWARE IS PROVIDED BY ITS AUTHORS ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
\* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/**
 * Colors to be used for ribbons. Based on a color scheme from
 * http://colorbrewer.org/
 */
public class ColorBrewer {
	
	public final static Color colors[] = {
			new Color(141f / 255f, 211f / 255f, 199f / 255f),
			new Color(190f / 255f, 186f / 255f, 218f / 255f),
			new Color(251f / 255f, 128f / 255f, 114f / 255f),
			new Color(128f / 255f, 177f / 255f, 211f / 255f),
			new Color(253f / 255f, 180f / 255f,  98f / 255f),
			new Color(179f / 255f, 222f / 255f, 105f / 255f),
			new Color(252f / 255f, 205f / 255f, 229f / 255f),
			new Color(217f / 255f, 217f / 255f, 217f / 255f),
			new Color(188f / 255f, 128f / 255f, 189f / 255f),
			new Color(204f / 255f, 235f / 255f, 197f / 255f),
			new Color(255f / 255f, 237f / 255f, 111f / 255f),
			new Color(255f / 255f, 255f / 255f, 179f / 255f)};

	public static void setColor(int colorNum, boolean darker, Graphics g) {
		colorNum = colorNum % colors.length;
		if (darker)
			g.setColor(colors[colorNum].darker());
		else
			g.setColor(colors[colorNum]);
	}
	
	public static void setColor(int colorNum, boolean darker, float alpha, Graphics g) {
		colorNum = colorNum % colors.length;
		Color c = null;
		if (darker)
			c = colors[colorNum].darker();
		else
			c = colors[colorNum];

		g.setColor(new Color(c.getRed()/255f, c.getGreen()/255f, c.getBlue()/255f, alpha));
	}
	
}
