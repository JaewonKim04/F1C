package com.kong.home.model.fake

import com.kong.common.Driver
import com.kong.home.model.LastRaceResultSummary

object FakeLastRaceResultSummary {

    fun getLastRaceResultSummary() = LastRaceResultSummary(
        raceName = "Belgium Grand Prix",
        sessionName = "Sprint",
        firstThreeDriverResultList = listOf(
            Driver(
                fullName = "Max VERSTAPPEN",
                broadcastName = "VER",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/1col/image.png",
                teamColorHexCode = "3671C6"
            ),
            Driver(
                fullName = "Lando NORRIS",
                broadcastName = "NOR",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png.transform/1col/image.png",
                teamColorHexCode = "F58020"
            ),
            Driver(
                fullName = "Fernando ALONSO",
                broadcastName = "ALO",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/1col/image.png",
                teamColorHexCode = "358C75"
            )
        )
    )
}