package com.kong.result.model.fake

import com.kong.common.Driver
import com.kong.result.model.DriverResult
import java.time.LocalDateTime

object FakeDriverResult {

    fun getFakeDriverResults() = listOf(
        DriverResult(
            driver = Driver(
                fullName = "Max VERSTAPPEN",
                broadcastName = "VER",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/1col/image.png",
                teamName = "Red Bull Racing",
                teamColorHexCode = "3671C6"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0f,
            gapToLeader = 0f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Lando NORRIS",
                broadcastName = "NOR",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png.transform/1col/image.png",
                teamName = "McLaren",
                teamColorHexCode = "F58020"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 0.312f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Fernando ALONSO",
                broadcastName = "ALO",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/1col/image.png",
                teamName = "Aston Martin",
                teamColorHexCode = "358C75"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 0.624f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Pierre GASLY",
                broadcastName = "GAS",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png.transform/1col/image.png",
                teamName = "Alpine",
                teamColorHexCode = "2293D1"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 0.936f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Sergio PEREZ",
                broadcastName = "PER",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/1col/image.png",
                teamName = "Red Bull Racing",
                teamColorHexCode = "3671C6"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 1.248f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Charles LECLERC",
                broadcastName = "LEC",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/1col/image.png",
                teamName = "Ferrari",
                teamColorHexCode = "F91536"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 1.56f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Kevin MAGNUSSEN",
                broadcastName = "MAG",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/K/KEVMAG01_Kevin_Magnussen/kevmag01.png.transform/1col/image.png",
                teamName = "Haas F1 Team",
                teamColorHexCode = "B6BABD"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 1.872f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Yuki TSUNODA",
                broadcastName = "TSU",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png.transform/1col/image.png",
                teamName = "RB",
                teamColorHexCode = "5E8FAA"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 2.184f
        ),
        DriverResult(
            driver = Driver(
                fullName = "ZHOU Guanyu",
                broadcastName = "ZHO",
                headshotUrl = "https://www.formula1.com/content/dam/fom-website/drivers/G/GUAZHO01_Guanyu_Zhou/guazho01.png.transform/1col/image.png",
                teamName = "Kick Sauber",
                teamColorHexCode = "52E252"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.312f,
            gapToLeader = 2.496f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Esteban OCON",
                broadcastName = "OCO",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png.transform/1col/image.png",
                teamName = "Alpine",
                teamColorHexCode = "0093cc"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.504f,
            gapToLeader = 3f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Lewis HAMILTON",
                broadcastName = "HAM",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png.transform/1col/image.png",
                teamName = "Mercedes",
                teamColorHexCode = "27F4D2"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 3.5f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Carlos SAINZ",
                broadcastName = "SAI",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/1col/image.png",
                teamName = "Ferrari",
                teamColorHexCode = "E80020"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 4f
        ),
        DriverResult(
            driver = Driver(
                fullName = "George RUSSELL",
                broadcastName = "RUS",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png.transform/1col/image.png",
                teamName = "Mercedes",
                teamColorHexCode = "27F4D2"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 4.5f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Valtteri BOTTAS",
                broadcastName = "BOT",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/V/VALBOT01_Valtteri_Bottas/valbot01.png.transform/1col/image.png",
                teamName = "Kick Sauber",
                teamColorHexCode = "52E252"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 5f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Oscar PIASTRI",
                broadcastName = "PIA",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png.transform/1col/image.png",
                teamName = "McLaren",
                teamColorHexCode = "FF8000"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 5.5f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Nico HULKENBERG",
                broadcastName = "HUL",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/N/NICHUL01_Nico_Hulkenberg/nichul01.png.transform/1col/image.png",
                teamName = "Haas F1 Team",
                teamColorHexCode = "B6BABD"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 6f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Alexander ALBON",
                broadcastName = "ALB",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ALEALB01_Alexander_Albon/alealb01.png.transform/1col/image.png",
                teamName = "Williams",
                teamColorHexCode = "64C4FF"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 6.5f
        ),
        DriverResult(
            driver = Driver(
                fullName = "Daniel RICCIARDO",
                broadcastName = "RIC",
                headshotUrl = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/D/DANRIC01_Daniel_Ricciardo/danric01.png.transform/1col/image.png",
                teamName = "RB",
                teamColorHexCode = "6692FF"
            ),
            raceTime = LocalDateTime.now(),
            interval = 0.5f,
            gapToLeader = 7f
        )
    )
}
