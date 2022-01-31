package com.example.showherodota.Model

import com.example.showherodota.R

class dotaHeroList {
    companion object {
        fun loadHeroList(): List<heroDota> {
            return listOf<heroDota>(
                heroDota(
                    R.drawable.luna_icon,
                    name = "Luna",
                    attribute = "Attribute:Agility",
                    R.string.frase1
                ),
                heroDota(
                    R.drawable.sniper_icon,
                    name = "Sniper",
                    attribute = "Attribute:Agility",
                    R.string.frase2
                ),
                heroDota(
                    R.drawable.shadow_shaman_icon,
                    name = "Shadow Shaman",
                    attribute = "Attribute:Intelligent",
                    R.string.frase3
                ),
                heroDota(
                    R.drawable.bounty_hunter_icon,
                    name = "Bounty Hunter",
                    attribute = "Attribute:Agility",
                    R.string.frase4
                ),
                heroDota(
                    R.drawable.dragon_knight_icon,
                    name = "Dragon knight",
                    attribute = "Attribute:Force",
                    R.string.frase5
                ),
                heroDota(
                    R.drawable.drow_ranger_icon,
                    name = "Drow Ranger",
                    attribute = "Attribute:Agility",
                    R.string.frase6
                ),
                heroDota(
                    R.drawable.omniknight_icon,
                    name = "Omniknight",
                    attribute = "Attribute:force",
                    R.string.frase7
                ),
                heroDota(
                    R.drawable.lina_icon,
                    name = "Lina",
                    attribute = "Attribute:Intelligent",
                    R.string.frase8
                ),
                heroDota(
                    R.drawable.crystal_maiden_icon,
                    name = "Crystal Maiden",
                    attribute = "Attribute:Intelligent",
                    R.string.frase9
                ),
                heroDota(
                    R.drawable.zeus_icon,
                    name = "Zeus",
                    attribute = "Attribute:Intelligent",
                    R.string.frase10
                ),
                heroDota(
                    R.drawable.naga_siren_icon,
                    name = "Naga Siren",
                    attribute = "Attribute:Agility",
                    R.string.frase11
                ),
                heroDota(
                    R.drawable.queen_of_pain_icon,
                    name = "Queen of Pain",
                    attribute = "Attribute:Intelligent",
                    R.string.frase12
                ),
                        heroDota(
                        R.drawable.wraith_king_icon,
                name = "Wraith King",
                attribute = "Attribute:Agility",
                R.string.frase13),
                        heroDota(
                        R.drawable.dazzle_icon,
                name = "Dazzle",
                attribute = "Attribute:Intelligent",
                R.string.frase14),
                        heroDota(
                        R.drawable.witch_doctor_icon,
                name = "Witch Doctor",
                attribute = "Attribute:Intelligent",
                R.string.frase15),
                        heroDota(
                        R.drawable.windranger_icon,
                name = "Winranger",
                attribute = "Attribute:Intelligent",
                R.string.frase16),
                        heroDota(
                        R.drawable.warlock_icon,
                name = "Warlock",
                attribute = "Attribute:Intelligent",
                R.string.frase17),
                        heroDota(
                        R.drawable.vengeful_spirit_icon,
                name = "Vengeful",
                attribute = "Attribute:Agility",
                R.string.frase18),
                        heroDota(
                        R.drawable.templar_assassin_icon,
                name = "Templar Assasin",
                attribute = "Attribute:Agility",
                R.string.frase19),
                        heroDota(
                        R.drawable.phantom_assassin_icon,
                name = "Phantom Assasin",
                attribute = "Attribute:Agility",
                R.string.frase20)
            )
        }

    }

}