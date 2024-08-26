package com.kong.common.fake

import com.kong.common.Driver

object FakeDriver {

    fun getFakeDriverList(): List<Driver> = listOf(
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
        ),
        Driver(
            fullName = "Pierre GASLY",
            broadcastName = "GAS",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png.transform/1col/image.png",
            teamColorHexCode = "2293D1"
        ),
        Driver(
            fullName = "Sergio PEREZ",
            broadcastName = "PER",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/1col/image.png",
            teamColorHexCode = "3671C6"
        ),
        Driver(
            fullName = "Charles LECLERC",
            broadcastName = "LEC",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/1col/image.png",
            teamColorHexCode = "F91536"
        ),
        Driver(
            fullName = "Kevin MAGNUSSEN",
            broadcastName = "MAG",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/K/KEVMAG01_Kevin_Magnussen/kevmag01.png.transform/1col/image.png",
            teamColorHexCode = "B6BABD"
        ),
        Driver(
            fullName = "Yuki TSUNODA",
            broadcastName = "TSU",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png.transform/1col/image.png",
            teamColorHexCode = "5E8FAA"
        ),
        Driver(
            fullName = "ZHOU Guanyu",
            broadcastName = "ZHO",
            headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/G/GUAZHO01_Guanyu_Zhou/guazho01.png.transform/1col/image.png",
            teamColorHexCode = "C92D4B"
        )
    )
}