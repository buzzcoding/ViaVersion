/*
 * This file is part of ViaVersion - https://github.com/ViaVersion/ViaVersion
 * Copyright (C) 2016-2021 ViaVersion and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.viaversion.viaversion.sponge.platform;

import com.viaversion.viaversion.api.boss.BossBar;
import com.viaversion.viaversion.api.boss.BossColor;
import com.viaversion.viaversion.api.boss.BossStyle;
import com.viaversion.viaversion.boss.CommonBoss;
import org.spongepowered.api.entity.living.player.Player;

public class SpongeBossBar extends CommonBoss<Player> {

    public SpongeBossBar(String title, float health, BossColor color, BossStyle style) {
        super(title, health, color, style);
    }

    @Override
    public BossBar addPlayer(Player player) {
        addPlayer(player.getUniqueId());
        return this;
    }

    @Override
    public BossBar addPlayers(Player... players) {
        for (Player p : players)
            addPlayer(p);
        return this;
    }

    @Override
    public BossBar removePlayer(Player player) {
        removePlayer(player.getUniqueId());
        return this;
    }
}