package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.specMoves.Blizzard;
import org.itmo.lab2.moves.physMoves.DreamEater;
import org.itmo.lab2.moves.statMoves.Roost;
import org.itmo.lab2.moves.statMoves.DoubleTeam;

import ru.ifmo.se.pokemon.*;

public class Dunsparce extends Pokemon {
    public Dunsparce(String name, int lvl) {
        super(name, lvl);

        double hp = 100, att = 70, def = 70,
                spAtt = 65, spDef = 65, speed = 45;

        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.NORMAL);

        this.setMove( new Blizzard(), new DoubleTeam(),
                new Roost(), new DreamEater());
    }
}
