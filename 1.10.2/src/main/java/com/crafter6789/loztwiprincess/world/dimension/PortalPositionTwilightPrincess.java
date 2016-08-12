package com.crafter6789.loztwiprincess.world.dimension;
import net.minecraft.util.ChunkCoordinates;

public class PortalPositionTwilightPrincess extends ChunkCoordinates{
	public long field_85087_d;
	final TeleporterTwilightPrincess field_85088_e;
	public PortalPositionTwilightPrincess(TeleporterTwilightPrincess tutorialTeleporter, int par2, int par3, int par4, long par5){
		super(par2, par3, par4);
		this.field_85088_e = tutorialTeleporter;
		this.field_85087_d = par5;
	}
}