import scala.io.StdIn.readLine

object MiniProject{
    def main(args: Array[String]): Unit = {

        println("\n\n\t\t\t\t\t\t\t*************************  S C A L A   M I N I   P R O J E C T  *************************\n\n")

        println("**In this mini project you will get information about your favorite sports person.\n\n")


        println("Name of some popular sports :- \n\t\t1.Cricket  \n\t\t2.Football\n")

        var game = ""
       
        game = readLine("\nSelect your favorite sport from the above list --> ")

        
        
        if(game == "1"){

            println("\n\n\t\" You selected Cricket as your favorite sport. \"\n\n")

            println("\tName of some popular cricket player --> \n\t\t1.M.S.Dhoni  \n\t\t2.Rohit Sharma  \n\t\t3.Sachin Tendulkar \n")

            var cplayer = ""
       
            cplayer=  readLine("\n\tSelect your favorite cricket player from the above list -->  ")


            if(cplayer == "1"){

                println("\n\n\tM.S.Dhoni is your favorite player.\n\n")

                
                var msdinfo = ""

                msdinfo = readLine("\n\tDo you want more information about M.S.Dhoni (yes / no) ?? ")


                if(msdinfo == "yes" || msdinfo == "Yes" || msdinfo == "YES" || msdinfo == "y" || msdinfo == "Y"){

                    println("\n\n\tYou want more information about M.S.Dhoni.")

                    println("\n\n\tFrom below catogories you can fetch more information about M.S.Dhoni.")

                    println("\n\n\t\t1.Personal Information  \n\t\t2.Career Information  \n\t\t3.Awards Information  \n\t\t4.All information")

                    var msdwhichinfo = ""

                    msdwhichinfo = readLine("\n\n\tWhich information about M.S.Dhoni you want to know ? -->  ")


                    if(msdwhichinfo == "1"){

                        println("\n\n\n\t\tPersonal Information about M.S.Dhoni :-")


                        println("\n\n\t\t\tFull Name : Mahendra Singh Dhoni")

                        println("\n\t\t\tBorn : 7 July 1981")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Mahi, Captain Cool, Thala")

                        println("\n\t\t\tHeight : 1.80 m (5 ft 11 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm medium")

                        println("\n\t\t\tRole : Wicket-keeper batsman")


                    }else if(msdwhichinfo == "2"){

                        println("\n\n\n\t\tCareer Information about M.S.Dhoni :-")


                        println("\n\n\t\t\tTotal Test Matches : 90")

                        println("\n\n\t\t\tTotal Runs Test Matches : 4,876")

                        println("\n\n\t\t\tTop Score in a Test Match : 224")

                        println("\n\n\t\t\tTotal ODI Matches : 350")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 10,773")

                        println("\n\n\t\t\tTop Score in a ODI Match : 183*")

                        println("\n\n\t\t\tTotal T20I Matches : 98")

                        println("\n\n\t\t\tTotal Runs T20I Matches : 1,617")

                        println("\n\n\t\t\tTop Score in a T20I Match : 56")


                    }else if(msdwhichinfo == "3"){

                        println("\n\n\n\t\tAwards achieved by M.S.Dhoni :-")


                        println("\n\n\t\t\tPadma Bhushan : 2018")

                        println("\n\n\t\t\tPadma Shri : 2009")

                        println("\n\n\t\t\tMajor Dhyanchand Khel Ratna Award : 2007-08")

                        println("\n\n\t\t\tICC Player of the Year : 2008, 2009")

                        println("\n\n\t\t\tICC Spirit of the Cricket Award of the decade : 2011-2020")


                    }else if(msdwhichinfo == "4"){


                        println("\n\n\n\t\tPersonal Information about M.S.Dhoni :-")

                        println("\n\n\t\t\tFull Name : Mahendra Singh Dhoni")

                        println("\n\t\t\tBorn : 7 July 1981")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Mahi, Captain Cool, Thala")

                        println("\n\t\t\tHeight : 1.80 m (5 ft 11 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm medium")

                        println("\n\t\t\tRole : Wicket-keeper batsman")


                        println("\n\n\n\t\tCareer Information about M.S.Dhoni :-")

                        println("\n\n\t\t\tTotal Test Matches : 90")

                        println("\n\n\t\t\tTotal Runs Test Matches : 4,876")

                        println("\n\n\t\t\tTop Score in a Test Match : 224")

                        println("\n\n\t\t\tTotal ODI Matches : 350")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 10,773")

                        println("\n\n\t\t\tTop Score in a ODI Match : 183*")

                        println("\n\n\t\t\tTotal T20I Matches : 98")

                        println("\n\n\t\t\tTotal Runs T20I Matches : 1,617")

                        println("\n\n\t\t\tTop Score in a T20I Match : 56")


                        println("\n\n\n\t\tAwards achieved by M.S.Dhoni :-")

                        println("\n\n\t\t\tPadma Bhushan : 2018")

                        println("\n\n\t\t\tPadma Shri : 2009")

                        println("\n\n\t\t\tMajor Dhyanchand Khel Ratna Award : 2007-08")

                        println("\n\n\t\t\tICC Player of the Year : 2008, 2009")

                        println("\n\n\t\t\tICC Spirit of the Cricket Award of the decade : 2011-2020")

                    }else{

                        println("\n\n\tSorry... You have entered invalid input.")

                    }


                }else if(msdinfo == "no" || msdinfo == "No" || msdinfo == "NO" || msdinfo == "n" || msdinfo == "N"){

                    println("\n\n\tYou don't want any information about M.S.Dhoni. This means that you already knows him very well.")

                }else {

                    println("\n\n\tSorry... You have entered invalid input.")

                }


            }else if(cplayer == "2"){

                println("\n\n\tRohit Sharma is your favorite player.\n\n")


                var rohitinfo = ""

                rohitinfo = readLine("\n\tDo you want more information about Rohit Sharma (yes / no) ?? ")

                if(rohitinfo == "yes" || rohitinfo == "Yes" || rohitinfo == "YES" || rohitinfo == "Y" || rohitinfo == "y"){

                    println("\n\n\tYou want more information about Rohit Sharma.")

                    println("\n\n\tFrom below catogories you can fetch more information about Rohit Sharma.")

                    println("\n\n\t\t1.Personal Information  \n\t\t2.Career Information  \n\t\t3.Awards Information  \n\t\t4.All information")

                    var rohitwhichinfo = ""

                    rohitwhichinfo = readLine("\n\n\tWhich information about Rohit Sharma you want to know ? -->  ")


                    if(rohitwhichinfo == "1"){

                        println("\n\n\n\t\tPersonal Information about Rohit Sharma :-")


                        println("\n\n\t\t\tFull Name : Rohit Gurunath Sharma")

                        println("\n\t\t\tBorn : 30 April 1987")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Hitman, Ro, Shanna, Father of Daddy Hundreds")

                        println("\n\t\t\tHeight : 1.70 m (5 ft 7 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm off break")

                        println("\n\t\t\tRole : Opening batsman")


                    }else if(rohitwhichinfo == "2"){

                        println("\n\n\n\t\tCareer Information about Rohit Sharma :-")


                        println("\n\n\t\t\tTotal Test Matches : 43")

                        println("\n\n\t\t\tTotal Runs Test Matches : 3,047")

                        println("\n\n\t\t\tTop Score in a Test Match : 212")

                        println("\n\n\t\t\tTotal ODI Matches : 227")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 9,205")

                        println("\n\n\t\t\tTop Score in a ODI Match : 264")

                        println("\n\n\t\t\tTotal T20I Matches : 119")

                        println("\n\n\t\t\tTotal Runs T20I Matches : 3,197")

                        println("\n\n\t\t\tTop Score in a T20I Match : 118")


                    }else if(rohitwhichinfo == "3"){

                        println("\n\n\n\t\tAwards achieved by Rohit Sharma :-")


                        println("\n\n\t\t\tArjuna Award : 2015")

                        println("\n\n\t\t\tMajor Dhyanchand Khel Ratna Award : 2020")

                        println("\n\n\t\t\tICC Player of the Year : 2019")


                    }else if(rohitwhichinfo == "4"){

                        println("\n\n\n\t\tPersonal Information about Rohit Sharma :-")


                        println("\n\n\t\t\tFull Name : Rohit Gurunath Sharma")

                        println("\n\t\t\tBorn : 30 April 1987")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Hitman, Ro, Shanna, Father of Daddy Hundreds")

                        println("\n\t\t\tHeight : 1.70 m (5 ft 7 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm off break")

                        println("\n\t\t\tRole : Opening batsman")


                        println("\n\n\n\t\tCareer Information about Rohit Sharma :-")


                        println("\n\n\t\t\tTotal Test Matches : 43")

                        println("\n\n\t\t\tTotal Runs Test Matches : 3,047")

                        println("\n\n\t\t\tTop Score in a Test Match : 212")

                        println("\n\n\t\t\tTotal ODI Matches : 227")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 9,205")

                        println("\n\n\t\t\tTop Score in a ODI Match : 264")

                        println("\n\n\t\t\tTotal T20I Matches : 119")

                        println("\n\n\t\t\tTotal Runs T20I Matches : 3,197")

                        println("\n\n\t\t\tTop Score in a T20I Match : 118")


                        println("\n\n\n\t\tAwards achieved by Rohit Sharma :-")


                        println("\n\n\t\t\tArjuna Award : 2015")

                        println("\n\n\t\t\tMajor Dhyanchand Khel Ratna Award : 2020")

                        println("\n\n\t\t\tICC Player of the Year : 2019")



                    }else{

                        println("\n\n\tSorry... You have entered invalid input.")

                    }


                }else if(rohitinfo == "no" || rohitinfo == "No" || rohitinfo == "NO" || rohitinfo == "N" || rohitinfo == "n"){

                    println("\n\n\tYou don't want any information about Rohit Sharma. This means that you already knows him very well.")

                }else {

                    println("\n\n\tSorry... You have entered invalid input.")

                }



            }else if(cplayer == "3"){

                println("\n\n\tSachin Tendulkar is your favorite player.\n\n")

                var sachininfo = ""

                sachininfo = readLine("\n\tDo you want more information about Sachin Tendulkar (yes / no) ?? ")


                if(sachininfo == "yes" || sachininfo == "Yes" || sachininfo == "YES" || sachininfo == "Y" || sachininfo == "y"){

                    println("\n\n\tYou want more information about Sachin Tendulkar.")

                    println("\n\n\tFrom below catogories you can fetch more information about Sachin Tendulkar.")

                    println("\n\n\t\t1.Personal Information  \n\t\t2.Career Information  \n\t\t3.Awards Information  \n\t\t4.All information")

                    var sachinwhichinfo = ""

                    sachinwhichinfo = readLine("\n\n\tWhich information about Sachin Tendulkar you want to know ? -->  ")


                    if(sachinwhichinfo == "1"){

                        println("\n\n\n\t\tPersonal Information about Sachin Tendulkar :-")


                        println("\n\n\t\t\tFull Name : Sachin Ramesh Tendulkar")

                        println("\n\t\t\tBorn : 24 April 1973")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Little Master, Master Blaster")

                        println("\n\t\t\tHeight : 1.65 m (5 ft 5 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm medium fast, leg break, off break")

                        println("\n\t\t\tRole : Batsman")


                    }else if(sachinwhichinfo == "2"){

                        println("\n\n\n\t\tCareer Information about Sachin Tendulkar :-")


                        println("\n\n\t\t\tTotal Test Matches : 200")

                        println("\n\n\t\t\tTotal Runs Test Matches : 15,921")

                        println("\n\n\t\t\tTop Score in a Test Match : 248*")

                        println("\n\n\t\t\tTotal ODI Matches : 463")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 18,426")

                        println("\n\n\t\t\tTop Score in a ODI Match : 200*")



                    }else if(sachinwhichinfo == "3"){

                        println("\n\n\n\t\tAwards achieved by Sachin Tendulkar :-")


                        println("\n\n\t\t\tArjuna Award : 1994")

                        println("\n\n\t\t\tRajiv Gandhi Khel Ratna Award : 1997,1998")

                        println("\n\n\t\t\tWisden Cricketer of the Year : 1997")

                        println("\n\n\t\t\tPadma Shri : 1999")

                        println("\n\n\t\t\tMaharastra Bhushan : 2001")

                        println("\n\n\t\t\tPadma Vibhushan : 2008")

                        println("\n\n\t\t\tICC Cricketer of the Year : 2010")



                    }else if(sachinwhichinfo == "4"){

                        println("\n\n\n\t\tPersonal Information about Sachin Tendulkar :-")


                        println("\n\n\t\t\tFull Name : Sachin Ramesh Tendulkar")

                        println("\n\t\t\tBorn : 24 April 1973")

                        println("\n\t\t\tCountry : India")

                        println("\n\t\t\tNickname : Little Master, Master Blaster")

                        println("\n\t\t\tHeight : 1.65 m (5 ft 5 in)")

                        println("\n\t\t\tBatting : Right-handed")

                        println("\n\t\t\tBowling : Right-arm medium fast, leg break, off break")

                        println("\n\t\t\tRole : Batsman")


                        println("\n\n\n\t\tCareer Information about Sachin Tendulkar :-")


                        println("\n\n\t\t\tTotal Test Matches : 200")

                        println("\n\n\t\t\tTotal Runs Test Matches : 15,921")

                        println("\n\n\t\t\tTop Score in a Test Match : 248*")

                        println("\n\n\t\t\tTotal ODI Matches : 463")

                        println("\n\n\t\t\tTotal Runs ODI Matches : 18,426")

                        println("\n\n\t\t\tTop Score in a ODI Match : 200*")


                        println("\n\n\n\t\tAwards achieved by Sachin Tendulkar :-")


                        println("\n\n\t\t\tArjuna Award : 1994")

                        println("\n\n\t\t\tRajiv Gandhi Khel Ratna Award : 1997,1998")

                        println("\n\n\t\t\tWisden Cricketer of the Year : 1997")

                        println("\n\n\t\t\tPadma Shri : 1999")

                        println("\n\n\t\t\tMaharastra Bhushan : 2001")

                        println("\n\n\t\t\tPadma Vibhushan : 2008")

                        println("\n\n\t\t\tICC Cricketer of the Year : 2010")


                    }else{

                        println("\n\n\tSorry... You have entered invalid input.")

                    }


                }else if(sachininfo == "no" || sachininfo == "No" || sachininfo == "NO" || sachininfo == "N" || sachininfo == "n"){

                    println("\n\n\tYou don't want any information about Sachin Tendulkar. This means that you already knows him very well.")

                }else {

                    println("\n\n\tSorry... You have entered invalid input.\n")

                }

            }else{

                println("\n\n\tSorry... You have entered invalid input.\n")

            }

        }else if(game == "2"){

            println("\n\n\t\" You selected Football as your favorite sport. \"\n\n")

            println("\tName of some popular football player --> \n\t\t1.Lionel Messi  \n\t\t2.Cristiano Ronaldo\n")

            var fplayer = ""
       
            fplayer=  readLine("\n\tSelect your favorite football player from the above list -->  ")

            if(fplayer == "1"){

                println("\n\n\tLionel Messi is your favorite player.\n\n")

                
                var messiinfo = ""

                messiinfo = readLine("\n\tDo you want more information about Lionel Messi (yes / no) ?? ")


                if(messiinfo == "yes" || messiinfo == "Yes" || messiinfo == "YES" || messiinfo == "y" || messiinfo == "Y"){

                    println("\n\n\tYou want more information about Lionel Messi.")

                    println("\n\n\tFrom below catogories you can fetch more information about Lionel Messi.")

                    println("\n\n\t\t1.Personal Information  \n\t\t2.Career Information  \n\t\t3.Awards Information  \n\t\t4.All information")

                    var messiwhichinfo = ""

                    messiwhichinfo = readLine("\n\n\tWhich information about Lionel Messi you want to know ? -->  ") 


                    if(messiwhichinfo == "1"){

                        println("\n\n\n\t\tPersonal Information about Lionel Messii :-")


                        println("\n\n\t\t\tFull Name : Lionel Andres Messi")

                        println("\n\t\t\tBorn : 24 June 1987")

                        println("\n\t\t\tCountry : Argentina")

                        println("\n\t\t\tHeight : 1.69 m (5 ft 7 in)")

                        println("\n\t\t\tPosition : Forward")


                    }else if(messiwhichinfo == "2"){

                        println("\n\n\n\t\tCareer Information about Lionel Messii :-")


                        println("\n\n\t\t\tTotal Games : 951")

                        println("\n\n\t\t\tTotal Goals : 758")

                        println("\n\n\t\t\tTotal Assists : 319")

                        println("\n\n\t\t\tTeams : FC Barcelona, Paris Saint-Germain, Argentina")


                    }else if(messiwhichinfo == "3"){

                        println("\n\n\n\t\tAwards achieved by Lionel Messi :-")


                        println("\n\n\t\t\tFIFA Ballon d'Or : 2009, 2010, 2011, 2012, 2015, 2019, 2021")

                        println("\n\n\t\t\tFIFA World Player of the Year : 2009")

                        println("\n\n\t\t\tThe Best FIFA Men's Player : 2019")

                        println("\n\n\t\t\tEuropean Golden Shoe : 2009, 2011, 2012, 2016, 2017, 2018")

                        println("\n\n\t\t\tFIFA World Cup Golden Ball : 2014")

                        println("\n\n\t\t\tArgentina Footballer of the Year : 2005, 2007, 2008, 2009, 2010, 2019 ")

                        println("\n\n\t\t\tLaureus World Sportsman of the Year : 2020")

                        println("\n\n\t\t\tBallon d'Or Dream Team : 2020")


                    }else if(messiwhichinfo == "4"){

                        println("\n\n\n\t\tPersonal Information about Lionel Messii :-")

                        println("\n\n\t\t\tFull Name : Lionel Andres Messi")

                        println("\n\t\t\tBorn : 24 June 1987")

                        println("\n\t\t\tCountry : Argentina")

                        println("\n\t\t\tHeight : 1.69 m (5 ft 7 in)")

                        println("\n\t\t\tPosition : Forward")


                        println("\n\n\n\t\tCareer Information about Lionel Messii :-")

                        println("\n\n\t\t\tTotal Games : 951")

                        println("\n\n\t\t\tTotal Goals : 758")

                        println("\n\n\t\t\tTotal Assists : 319")

                        println("\n\n\t\t\tTeams : FC Barcelona, Paris Saint-Germain, Argentina")


                        println("\n\n\n\t\tAwards achieved by Lionel Messi :-")


                        println("\n\n\t\t\tFIFA Ballon d'Or : 2009, 2010, 2011, 2012, 2015, 2019, 2021")

                        println("\n\n\t\t\tFIFA World Player of the Year : 2009")

                        println("\n\n\t\t\tThe Best FIFA Men's Player : 2019")

                        println("\n\n\t\t\tEuropean Golden Shoe : 2009, 2011, 2012, 2016, 2017, 2018")

                        println("\n\n\t\t\tFIFA World Cup Golden Ball : 2014")

                        println("\n\n\t\t\tArgentina Footballer of the Year : 2005, 2007, 2008, 2009, 2010, 2019 ")

                        println("\n\n\t\t\tLaureus World Sportsman of the Year : 2020")

                        println("\n\n\t\t\tBallon d'Or Dream Team : 2020")

                    }else {

                        println("\n\n\tSorry... You have entered invalid input.")

                    }


                }else if(messiinfo == "no" || messiinfo == "No" || messiinfo == "NO" || messiinfo == "n" || messiinfo == "N"){

                    println("\n\n\tYou don't want any information about Lionel Messi. This means that you already knows him very well.")

                }else {

                    println("\n\n\tSorry... You have entered invalid input.")

                }

                

            }else if(fplayer == "2"){

                println("\n\n\tCristiano Ronaldo is your favorite player.\n\n")
                
                var ronaldoinfo = ""

                ronaldoinfo = readLine("\n\tDo you want more information about Cristiano Ronaldo (yes / no) ?? ")


                if(ronaldoinfo == "yes" || ronaldoinfo == "Yes" || ronaldoinfo == "YES" || ronaldoinfo == "y" || ronaldoinfo == "Y"){

                    println("\n\n\tYou want more information about Christiano Ronaldo.")

                    println("\n\n\tFrom below catogories you can fetch more information about Christiano Ronaldo.")

                    println("\n\n\t\t1.Personal Information  \n\t\t2.Career Information  \n\t\t3.Awards Information  \n\t\t4.All information")

                    var ronaldowhichinfo = ""

                    ronaldowhichinfo = readLine("\n\n\tWhich information about Christiano Ronaldo you want to know ? -->  ")

                    if(ronaldowhichinfo == "1"){

                        println("\n\n\n\t\tPersonal Information about Christiano Ronaldo :-")


                        println("\n\n\t\t\tFull Name : Christiano Ronaldo dos Santos Aveiro")

                        println("\n\t\t\tBorn : 5 February 1985")

                        println("\n\t\t\tCountry : Portugal")

                        println("\n\t\t\tHeight : 1.87 m (6 ft 2 in)")

                        println("\n\t\t\tPosition : Forward")


                    }else if(ronaldowhichinfo == "2"){

                        println("\n\n\n\t\tCareer Information about Christiano Ronaldo :-")


                        println("\n\n\t\t\tTotal Games : 1097")

                        println("\n\n\t\t\tTotal Goals : 802")

                        println("\n\n\t\t\tTotal Assists : 229")

                        println("\n\n\t\t\tTeams : Sporting CP, Real Madrid, Juventus, Manchester United, Portugal")


                    }else if(ronaldowhichinfo == "3"){

                        println("\n\n\n\t\tAwards achieved by Christiano Ronaldo :-")


                        println("\n\n\t\t\tFIFA Ballon d'Or : 2008, 2013, 2014, 2016, 2017")

                        println("\n\n\t\t\tFIFA World Player of the Year : 2008")

                        println("\n\n\t\t\tThe Best FIFA Men's Player : 2016, 2017")

                        println("\n\n\t\t\tEuropean Golden Shoe : 2007, 2010, 2013, 2014")

                        println("\n\n\t\t\tLa Liga Best Player : 2013-14")


                    }else if(ronaldowhichinfo == "4"){

                        println("\n\n\n\t\tPersonal Information about Christiano Ronaldo :-")

                        println("\n\n\t\t\tFull Name : Christiano Ronaldo dos Santos Aveiro")

                        println("\n\t\t\tBorn : 5 February 1985")

                        println("\n\t\t\tCountry : Portugal")

                        println("\n\t\t\tHeight : 1.87 m (6 ft 2 in)")

                        println("\n\t\t\tPosition : Forward")


                        println("\n\n\n\t\tCareer Information about Christiano Ronaldo :-")

                        println("\n\n\t\t\tTotal Games : 1097")

                        println("\n\n\t\t\tTotal Goals : 802")

                        println("\n\n\t\t\tTotal Assists : 229")

                        println("\n\n\t\t\tTeams : Sporting CP, Real Madrid, Juventus, Manchester United, Portugal")


                        println("\n\n\n\t\tAwards achieved by Christiano Ronaldo :-")

                        println("\n\n\t\t\tFIFA Ballon d'Or : 2008, 2013, 2014, 2016, 2017")

                        println("\n\n\t\t\tFIFA World Player of the Year : 2008")

                        println("\n\n\t\t\tThe Best FIFA Men's Player : 2016, 2017")

                        println("\n\n\t\t\tEuropean Golden Shoe : 2007, 2010, 2013, 2014")

                        println("\n\n\t\t\tLa Liga Best Player : 2013-14")

                    }else {

                        println("\n\n\tSorry... You have entered invalid input.")

                    }


                }else if(ronaldoinfo == "no" || ronaldoinfo == "No" || ronaldoinfo == "NO" || ronaldoinfo == "n" || ronaldoinfo == "N"){

                    println("\n\n\tYou don't want any information about Christiano Ronaldo. This means that you already knows him very well.")

                }else{

                    println("\n\n\tSorry... You have entered invalid input.")

                }


            }else{

                println("\n\n\tSorry... You have entered invalid input.\n")

            }


        }else{
            println("\nSorry... Invalid input...\n\n")
        }

        println("\n\n")

        println("\n\n\t\t\t\t\t\t\t*************************  BE SAFE   *************************")

        println("\n\n\t\t\t\t\t\t\t*************************  BE VACCINATED   *******************")

        println("\n\n\t\t\t\t\t\t\t*************************  THANK YOU   ***********************")

        println("\n\n")


    }
}