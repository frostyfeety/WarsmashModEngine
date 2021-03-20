package com.etheller.warsmash.viewer5.handlers.w3x.simulation.trigger.enumtypes;

public enum CGameType {
	MELEE,
	FFA,
	USE_MAP_SETTINGS,
	BLIZ,
	ONE_ON_ONE,
	TWO_TEAM_PLAY,
	THREE_TEAM_PLAY,
	FOUR_TEAM_PLAY;

	public static CGameType[] VALUES = values();

	public static CGameType getById(final int id) {
		for (final CGameType type : VALUES) {
			if ((type.getId()) == id) {
				return type;
			}
		}
		return null;
	}

	public int getId() {
		return 1 << ordinal();
	}
}
