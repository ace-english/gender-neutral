package com.genderneutral;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GenderNeutralPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GenderNeutralPlugin.class);
		RuneLite.main(args);
	}
}