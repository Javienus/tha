import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ThaineBot extends ListenerAdapter {
    private static int irr=0;
    private  static int gay=9;
    private  static int[] arrayGay= {1,2,3,4,5,6,7,8,9};
    private  static int furry=4;
    private  static int[] arrayFurry= {1,2,3,4};
    private  static int mentionNoam=3;
    private  static int[] arrayMentionNoam= {1,2,3};
    private  static int mention=3;
    private  static int[] arrayMention= {1,2,3};
    private  static int jason=7;
    private  static int[] arrayJason= {1,2,3,4,5,6,7};
    private  static int noam=6;
    private  static int[] arrayNoam= {1,2,3,4,5,6};
    private  static int ess=4;
    private  static int[] arrayEss= {1,2,3,4};
    private  static int emoji=6;
    private  static int[] arrayEmoji= {1,2,3,4,5,6};
    private  static int howR=10;
    private  static int[] arrayHowR= {1,2,3,4,5,6,7,8,9,10};
    private  static int fortnite=8;
    private  static int[] arrayFortnite= {1,2,3,4,5,6,7,8};
    private  static int leave=8;
    private static int[] arrayLeave= {1,2,3,4,5,6,7,8};
    private static int promotion=5;
    private static int[] arrayPromotion= {1,2,3,4,5};
    private  static int[] varUnique= {1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1};
    public static void main(String [] args) throws LoginException{
try {
    JDA jda = new JDABuilder(AccountType.BOT).setToken("NTgwNDExMzc0NjE4ODA0MjY1.XOQUqw.KFmCk_lZypmuQhiQkm07hr8OcUA").build();
    jda.addEventListener(new ThaineBot());
    jda.getPresence().setGame(Game.watching("vlog 71"));
}catch(LoginException e){
    System.out.println(e);
}

    }
    private static int randomUniqueNumbers(int[] arrayR, int r) {
        int rand=(int)(Math.random()*(r));
        int tmp=arrayR[rand];
        arrayR[rand]=0;
        for(int i=0; i<r-1; i++ ) {
            if(arrayR[i]<arrayR[i+1]) {
                int tmp2=arrayR[i];
                arrayR[i]=arrayR[i+1];
                arrayR[i+1]=tmp2;
            }
        }
        return tmp;
    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message objMsg = event.getMessage();
        MessageChannel objChan = event.getChannel();
        User objUser = event.getAuthor();
        Guild objGuild = event.getGuild();
        boolean botOrNot = objUser.isBot();

        int chances = (int) (Math.random() * 1001);
        try {
            Pattern searchingGay = Pattern.compile(".*gay.*|.*Gay.*|.*GAY.*");
            Matcher findingGay = searchingGay.matcher(objMsg.getContentDisplay());

            Pattern searchingFurry = Pattern.compile(".*furry*|.*Furry.*|.*furries.*|.*Furries.*");
            Matcher findingFurry = searchingFurry.matcher(objMsg.getContentDisplay());

            Pattern searchingNOAM = Pattern.compile(".*noam.*|.*Noam.*");
            Matcher findingNOAM = searchingNOAM.matcher(objMsg.getContentDisplay());

            Pattern searchingEmoji = Pattern.compile(".*:.*thaine.*:.*|.*:.*Thaine.*:.*");
            Matcher findingEmoji = searchingEmoji.matcher(objMsg.getContentDisplay());

            Pattern searchingHi = Pattern.compile("hi thaine|Hi thaine|hello thaine|Hello thaine|yo thaine|Yo thaine|hi.*J0hn_Kr4m3r.*|Hi.*J0hn_Kr4m3r.*|hello.*J0hn_Kr4m3r.*|Hello.*J0hn_Kr4m3r.*");
            Matcher findingHi = searchingHi.matcher(objMsg.getContentDisplay());

            Pattern searchingHowRU = Pattern.compile("how.*thaine|How.*thaine|how.*J0hn_Kr4m3r|How.*J0hn_Kr4m3r|what.*Thaine|What.*thaine|what.*J0hn_Kr4m3r|What.*J0hn_Kr4m3r");
            Matcher findingHowRU = searchingHowRU.matcher(objMsg.getContentDisplay());

            Pattern searchingMention = Pattern.compile(".*thaine.*|.*Thaine.*|.*J0hn_Kr4m3r.*");
            Matcher findingMention = searchingMention.matcher(objMsg.getContentDisplay());

            Pattern searching11 = Pattern.compile(".*fortnite.*|.*Fortnite.*");
            Matcher finding11 = searching11.matcher(objMsg.getContentDisplay());

//=========================================== GAY ================================================================
            if (findingGay.find() && !botOrNot) {
                int i = randomUniqueNumbers(arrayGay, gay--);
                if (i == 1) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Quit saying I’m gay when I’m not fucking gay").queue();
                    irr++;
                }
                if (i == 2) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("I’m not fucking gay, you dumbass. I would rather be hung with my own intestines that be gay.").queue();
                    irr++;
                }
                if (i == 3) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Miss me with that fucking gay shit").queue();
                    irr++;
                }
                if (i == 4) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Go on, fucking ban me.").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Because I don’t like gays").queue();
                    irr++;
                }
                if (i == 5) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I’m not fucking gay").queue();
                    irr++;
                }
                if (i == 6) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("Just because I haven’t slept with a woman yet doesn’t mean I’m gay, because I’m very much not gay").queue();
                    irr++;
                }
                if (i == 7) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I thought this wasn’t a gay chat").queue();
                    irr++;
                }
                if (i == 8) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Whenever I'm near someone that is gay i feel uncomfortable").queue();
                    irr++;
                }
                if (i == 9) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage(" I’d rather fucking off myself in the most painful way imaginable, than be gay.").queue();
                    irr++;
                }
                if (gay == 0) {
                    gay = 9;
                    for (int z = 0; z < gay; z++)
                        arrayGay[z] = z + 1;
                }
            }
//=============================================== FURRY ==========================================================================
            else if (findingFurry.find() && !botOrNot) {
                int i2 = randomUniqueNumbers(arrayFurry, furry--);
                if (i2 == 1) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Oh for the love of Christ").queue();
                    irr++;
                }
                if (i2 == 2) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("https://media.discordapp.net/attachments/528598098856116228/574684088825282577/8Uo5O56.jpg").queue();
                    irr++;
                }
                if (i2 == 3) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("*I don’t feel so good*").queue();
                    objChan.sendMessage("Dies").queue();
                }
                if (i2 == 4) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("XD wtf").queue();
                }
                if (furry == 0) {
                    furry = 4;
                    for (int z = 0; z < furry; z++)
                        arrayFurry[z] = z + 1;
                }
            }
//======================================== NOAM ==========================================
            else if (findingNOAM.find() && !botOrNot) {
                int iN = randomUniqueNumbers(arrayMentionNoam, mentionNoam--);
                if (iN == 3) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("he fucking comes up in my dms saying all sorts of weird fucked up shit").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("he needs to apologize to me").queue();
                }
                if (iN == 2) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Fuck Noam").queue();
                }
                if (iN == 1) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Fuck him To hell with him and jehrico").queue();
                }
                if (mentionNoam == 0) {
                    mentionNoam = 3;
                    for (int z = 0; z < mentionNoam; z++)
                        arrayMentionNoam[z] = z + 1;
                }
            }
//=========================================== MENTION ========================================================
            else if (findingMention.find() && !botOrNot) {
                if (objUser.getAsTag().equals("319164429012828162")) {
                    int p = randomUniqueNumbers(arrayNoam, noam--);
                    if (p == 1) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("Woah he’s being a dick").queue();
                        irr++;
                    }
                    if (p == 2) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("Well fuck you too asshole " + objUser.getAsMention()).queue();
                        irr++;
                    }
                    if (p == 3) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("Fuck off and keep wanking to your weird shit").queue();
                        irr++;
                    }
                    if (p == 4) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("I know that message is fucking bullshit......").queue();
                        irr++;
                    }
                    if (p == 5) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("? Um no I’m not gay").queue();
                        irr++;
                    }
                    if (p == 6) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("Um the fuck?").queue();
                        irr++;
                    }
                    if (noam == 0) {
                        noam = 6;
                        for (int i = 0; i < arrayNoam.length; i++)
                            arrayNoam[i] = i + 1;
                    }
                } else if (objUser.getAsTag().equals("319153381589647362")) {
                    int y = randomUniqueNumbers(arrayJason, jason--);
                    if (y == 1) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("You don’t own me").queue();
                    }
                    if (y == 2) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("Your just fucking sick").queue();
                        irr++;
                    }
                    if (y == 3) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("What do you think I am some sort of fucking retard?").queue();
                        irr++;
                    }
                    if (y == 4) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("oh fuck off").queue();
                        irr++;
                    }
                    if (y == 5) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("I simply want to be left the fuck alone, not reminded of retarded fucking bullshit").queue();
                        irr++;
                    }
                    if (y == 6) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("Um the fuck?").queue();
                        irr++;
                    }
                    if (y == 7) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("Jason is a cancer").queue();
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("lets not infect this server with him").queue();
                        irr++;
                    }
                    if (jason == 0) {
                        jason = 7;
                        for (int i = 0; i < arrayJason.length; i++)
                            arrayJason[i] = i + 1;
                    }
                } else if (objUser.getAsTag().equals("442088171006722048")) {
                    int o = randomUniqueNumbers(arrayEss, ess--);
                    if (o == 1) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("What do you care?").queue();
                        irr++;
                    }
                    if (o == 2) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("Well, tell ess I’m getting annoyed by his behavior").queue();
                        irr++;
                    }
                    if (o == 3) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("oh fuck off " + objUser.getAsMention()).queue();
                        irr++;
                    }
                    if (o == 4) {
                        objChan.sendTyping().queue();
                        objChan.sendMessage("Um the fuck?").queue();
                        irr++;
                    }
                    if (ess == 0) {
                        ess = 4;
                        for (int i = 0; i < arrayEss.length; i++)
                            arrayEss[i] = i + 1;
                    }
                } else if (objUser.getAsTag().equals("384373657843269632") && chances < 30) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Saying meesa cry, leave again , stfu").queue();
                } else if (objUser.getAsTag().equals("431691823086305280") && chances < 30) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Yeah well I used to trust Jamie but now I can’t").queue();
                } else {
                    int iM = randomUniqueNumbers(arrayMention, mention--);
                    if (iM == 3) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("I came to see why i had notifications").queue();
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("and i see this shit").queue();
                    }
                    if (iM == 2) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("I thought some serious shit was going down").queue();
                        objChan.sendTyping().queue();
                        objChan.sendMessage("But no").queue();
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("It was just some incompetent waste of human life spamming shit over and over").queue();
                    }
                    if (iM == 1) {
                        objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                        objChan.sendMessage("It honestly scared the fuck outta me").queue();
                    }
                    if (mention == 0) {
                        mention = 3;
                        for (int z = 0; z < mention; z++)
                            arrayMention[z] = z + 1;
                    }
                }
            }
//======================================= EMOJI ============================================
            else if (findingEmoji.find() && !botOrNot) {
                int iii = randomUniqueNumbers(arrayEmoji, emoji--);
                if (iii == 1) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("The retarded bullshit, the memes, the screenshots.").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I can’t take it anymore").queue();
                    irr++;
                }
                if (iii == 2) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Fuck off with that shit").queue();
                    irr++;
                }
                if (iii == 3) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Oh God fucking dammit").queue();
                    irr++;
                }
                if (iii == 4) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Let it fucking die").queue();
                    irr++;
                }
                if (iii == 5) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Oh fuck off with that shit.").queue();
                    irr++;
                }
                if (iii == 6) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("why the emojis over and over?").queue();
                    irr++;
                }
                if (emoji == 0) {
                    emoji = 6;
                    for (int i = 0; i < emoji; i++)
                        arrayEmoji[i] = i + 1;
                }
            }
//================================================= Hi ==================================================
            else if (findingHi.find() && !botOrNot) {
                int y = (int) (Math.random() * 100);
                if (objUser.getAsTag().equals("419571845088411650")) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hi Akhon").queue();
                } else if (objUser.getAsTag().equals("388506484415135754") && y > 51) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hi Jess").queue();
                } else if (objUser.getAsTag().equals("168813002299015168") && y > 49) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hello Reece").queue();
                } else if (y > 96) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Hey man").queue();
                    objChan.sendMessage("Wazzup").queue();
                } else if (y > 88) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("yo").queue();
                } else if (y > 74) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hi " + objUser.getAsMention()).queue();
                } else if (y > 57) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Ey man").queue();
                } else if (y > 45) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Hey man").queue();
                } else if (y > 34) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hey").queue();
                } else if (y > 20) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("hi").queue();
                }
            }
//================================================== HOW ARE YOU ==========================================================
            else if (findingHowRU.find() && !botOrNot) {
                int iiii = randomUniqueNumbers(arrayHowR, howR--);
                if (iiii == 1) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("I’m good").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Just sitting here alone").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Cast away because of a joke, treated like crap").queue();
                } else if (iiii == 2) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Annoyed").queue();
                    objChan.sendTyping().completeAfter(500, TimeUnit.MILLISECONDS);
                    objChan.sendMessage("Pissed off").queue();
                    objChan.sendTyping().completeAfter(500, TimeUnit.MILLISECONDS);
                    objChan.sendMessage("Depressed").queue();
                } else if (iiii == 3) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Just laying down, staring at the ceiling and occasionally checking my phone. You?" + objUser.getAsMention()).queue();
                } else if (iiii == 4) {
                    objChan.sendTyping().completeAfter(500, TimeUnit.MILLISECONDS);
                    objChan.sendMessage("I’m good").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I finished that video finally").queue();
                } else if (iiii == 5) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("A new video is up my friend").queue();
                } else if (iiii == 6) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Decent").queue();
                    objChan.sendTyping().completeAfter(500, TimeUnit.MILLISECONDS);
                    objChan.sendMessage("How’s Jehrico.").queue();
                } else if (iiii == 7) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I am aggravated, tired, and haven’t had a shower in a few days").queue();
                } else if (iiii == 8) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Decent").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("About to get in the shower").queue();
                } else if (iiii == 9) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("I’m decent").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Thanks for asking").queue();
                } else if (iiii == 10) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I don’t want to seem like a hateful cunt, but today I just want to be left alone.").queue();
                }
                if (howR == 0) {
                    howR = 10;
                    for (int i = 0; i < howR; i++)
                        arrayHowR[i] = i + 1;
                }
            }
//======================================================= FORTNITE ===========================================
            else if ((finding11.find() && !botOrNot) || (chances == 50 && !botOrNot)) {
                int f = randomUniqueNumbers(arrayFortnite, fortnite--);
                if (f == 1) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("https://cdn.discordapp.com/attachments/466271969835220999/468428984326160425/welcome-to-fortnite-5b2023.jpg").queue();
                    objChan.sendTyping().queue();
                    objChan.sendMessage("FORTNITE IS CANCER").queue();
                }
                if (f == 2) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Seriously this cancerous tumor on society that people call a 'game' needs to die. FUCK FORTNITE").queue();
                }
                if (f == 3) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Oh").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("https://media.discordapp.net/attachments/498525281611415552/538474742236053524/image0.jpg?width=503&height=670").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I walked by the toy section and saw this cancer").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Seriously fuck Fortnite").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Fortnite is a cancerous tumor on society").queue();
                }
                if (f == 4) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("You agree Fortnite is cancer right?" + objUser.getAsMention()).queue();
                }
                if (f == 5) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("I hate Fortnite").queue();
                    objChan.sendTyping().queue();
                    objChan.sendMessage("It’s just cancer").queue();
                }
                if (f == 6) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Is this").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("A fucking Fortnite server?").queue();
                }
                if (f == 7) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("Ugh Fortnite").queue();
                }
                if (f == 8) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("FortCancer").queue();
                }
                if (fortnite == 0) {
                    fortnite = 8;
                    for (int i = 0; i < fortnite; i++)
                        arrayFortnite[i] = i + 1;
                }
            }


//==================================== REST =========================================================
            else if (!botOrNot && chances == 999) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Fuck Jericho").queue();
            } else if (!botOrNot && chances == 996 && varUnique[0] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Fucking delete it").queue();
                varUnique[0] = 0;
            } else if (!botOrNot && chances == 995 && varUnique[1] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("The fuck").queue();
                varUnique[1] = 0;
            } else if (!botOrNot && chances == 994 && varUnique[2] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’m getting annoyed as fuck").queue();
                varUnique[2] = 0;
                irr++;
            } else if (!botOrNot && chances == 991 && varUnique[3] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Did you see my new video?").queue();
                objChan.sendTyping().completeAfter(500, TimeUnit.MILLISECONDS);
                objChan.sendMessage("Not trying to spam").queue();
                varUnique[3] = 0;
            } else if (!botOrNot && chances == 989 && varUnique[4] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I know that message is fucking bullshit......").queue();
                varUnique[4] = 0;
            } else if (!botOrNot && chances == 987 && varUnique[5] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Holy shit this is fucking crazy").queue();
                varUnique[5] = 0;
            } else if (!botOrNot && chances == 985 && varUnique[6] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Fucking hell hold on").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("He’s making another fucking video about me").queue();
                varUnique[6] = 0;
            } else if (!botOrNot && chances == 983 && varUnique[7] == 1) {
                {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("im not crying").queue();
                    objChan.sendTyping().queue();
                    objChan.sendMessage("seriously").queue();
                    varUnique[7] = 0;
                }
            } else if (!botOrNot && chances == 981 && varUnique[8] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Fuck that horse shit").queue();
                varUnique[8] = 0;
                irr++;
            } else if (!botOrNot && chances == 979 && varUnique[9] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Bullshit").queue();
                varUnique[9] = 0;
            } else if (!botOrNot && chances == 978 && varUnique[10] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Fuck Noam").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("He is a hateful cunt to me").queue();
                varUnique[10] = 0;
            } else if (!botOrNot && chances == 977 && varUnique[11] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Just saw your new video " + objUser.getAsMention()).queue();
                objChan.sendTyping().queue();
                objChan.sendMessage("Epic").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Can you check out one of mine?").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Just curious you don’t have to").queue();
                varUnique[11] = 0;
            } else if (!botOrNot && chances == 976 && varUnique[12] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("The gay jokes").queue();
                varUnique[12] = 0;
            } else if (!botOrNot && chances == 975 && varUnique[13] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Well you and I are still friends right? " + objUser.getAsMention()).queue();
                varUnique[13] = 0;
            } else if (!botOrNot && chances == 974 && varUnique[14] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Well no shit " + objUser.getAsMention()).queue();
                varUnique[14] = 0;
            } else if (!botOrNot && chances == 973 && varUnique[15] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("The fuck does that mean").queue();
                varUnique[15] = 0;
            } else if (!botOrNot && chances == 972 && varUnique[16] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Do you have your mic?" + objUser.getAsMention()).queue();
                varUnique[16] = 0;
            } else if (!botOrNot && chances == 971 && varUnique[17] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Goddamn it").queue();
                varUnique[17] = 0;
            } else if (!botOrNot && chances == 970 && varUnique[18] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Godfuckingdammit").queue();
                varUnique[18] = 0;
                irr++;
            } else if (!botOrNot && chances == 969 && varUnique[19] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("K!").queue();
                varUnique[19] = 0;
            } else if (!botOrNot && chances == 968 && varUnique[20] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Hmm").queue();
                varUnique[20] = 0;
            } else if (!botOrNot && chances == 967 && varUnique[21] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("I saw that").queue();
                varUnique[21] = 0;
            } else if (!botOrNot && chances == 966 && varUnique[22] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("So much bullshit has happened in the past week").queue();
                varUnique[22] = 0;
            } else if (!botOrNot && chances == 965 && varUnique[23] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("The fuck is this?!").queue();
                varUnique[23] = 0;
            } else if (!botOrNot && chances == 964 && varUnique[24] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("The fuck is happening").queue();
                varUnique[24] = 0;
            } else if (!botOrNot && chances == 963 && varUnique[25] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Christ you people are shallow").queue();
                varUnique[25] = 0;
            } else if (!botOrNot && chances == 962 && varUnique[26] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Enough with this fucking horseshit").queue();
                varUnique[26] = 0;
                irr++;
            } else if (!botOrNot && chances == 961 && varUnique[27] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What are you talking about " + objUser.getAsMention()).queue();
                varUnique[27] = 0;
            } else if (!botOrNot && chances == 960 && varUnique[28] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Suuuuuuure....").queue();
                varUnique[28] = 0;
            } else if (!botOrNot && chances == 959 && varUnique[29] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Ill talk to you later " + objUser.getAsMention()).queue();
                varUnique[29] = 0;
            } else if (!botOrNot && chances == 958 && varUnique[30] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What did ya think of my new video?" + objUser.getAsTag()).queue();
                objChan.sendTyping().queue();
                objChan.sendMessage("Yours was awesome btw").queue();
                varUnique[30] = 0;
            } else if (!botOrNot && chances == 957 && varUnique[31] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What did I miss I was busy with some bs").queue();
                varUnique[31] = 0;
            } else if (!botOrNot && chances == 956 && varUnique[32] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("ha yeah so fucking funny").queue();
                varUnique[32] = 0;
            } else if (!botOrNot && chances == 955 && varUnique[33] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Anyone join my roblox giveaway? XD").queue();
                objChan.sendMessage("XD").queue();
                varUnique[33] = 0;
            } else if (!botOrNot && chances == 447 && varUnique[34] == 1) {
                objChan.sendMessage("https://media.discordapp.net/attachments/444538774219653121/509504567369662478/image0.png?width=378&height=671").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Lol, “how you greet a friend”").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Bullshit, I’m not friends with complete wastes").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Or people who are completely cunty").queue();
                objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                objChan.sendMessage("He sounds like an edgy 13 year old").queue();
                objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                objChan.sendMessage("“Watch were you go”").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Oh I’m so afraid of a cunt").queue();
                varUnique[34] = 0;
            } else if (!botOrNot && chances == 954 && varUnique[35] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("When ever I see a pride parade, I burn their flag.").queue();
                varUnique[35] = 0;
            } else if (!botOrNot && chances == 953 && varUnique[36] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Want to see a thumbnail for my next video?").queue();
                objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                objChan.sendMessage("https://media.discordapp.net/attachments/528596368156262402/575058813351231507/2FWelIH.jpg").queue();
                varUnique[36] = 0;
            } else if (!botOrNot && chances == 952 && varUnique[37] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("?").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("the hell are you on about?").queue();
                varUnique[37] = 0;
            } else if (!botOrNot && chances == 951 && varUnique[38] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("The fuck").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Just happened").queue();
                varUnique[38] = 0;
            } else if (!botOrNot && chances == 950 && varUnique[39] == 1) {  //=====================
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I wonder why I joined").queue();
                varUnique[39] = 0;
            } else if (!botOrNot && chances == 949 && varUnique[40] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Well bye I’m gonna pass out now, see you guys later, I guess, if you guys even give a shit idk.").queue();
                objChan.sendTyping().completeAfter(5, TimeUnit.SECONDS);
                objChan.sendMessage("I have been up for 36 hours").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’m trying to get to at least 40").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Dunno if I’m gonna make it").queue();
                varUnique[40] = 0;
            } else if (!botOrNot && chances == 948 && varUnique[41] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Ok I’m back from being gone for so long what did I miss").queue();
                varUnique[41] = 0;
            } else if (!botOrNot && chances == 947 && varUnique[42] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("it gets pretty annoying...").queue();
                varUnique[42] = 0;
            } else if (!botOrNot && chances == 946 && varUnique[43] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Don’t seem so fucking welcomed").queue();
                varUnique[43] = 0;
            } else if (!botOrNot && chances == 945 && varUnique[44] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("why am i called cuck by some of the fucking people here").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("especially when it makes no fucking sense").queue();
                varUnique[44] = 0;
            } else if (!botOrNot && chances == 944 && varUnique[45] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("multiple times yesterday, *I love to hate Freeman* ").queue();
                objChan.sendTyping().queue();
                objChan.sendMessage("ringing any bells?").queue();
                varUnique[45] = 0;
            } else if (!botOrNot && chances == 943 && varUnique[46] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’m just gonna leave. you guys obviously don’t want me here and staying here anymore just saddens me.").queue();
                varUnique[46] = 0;
            } else if (!botOrNot && chances == 942 && varUnique[47] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Maybe someone could finish me off with a curbstomp?").queue();
                varUnique[47] = 0;
            } else if (!botOrNot && chances == 941 && varUnique[48] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’ll be back, lemme just slam my teeth into the sidewalk ").queue();
                varUnique[48] = 0;
            } else if (!botOrNot && chances == 940 && varUnique[49] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("What the hell?").queue();
                varUnique[49] = 0;
            } else if (!botOrNot && chances == 939 && varUnique[50] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’d rather put a gun between my teeth").queue();
                objChan.sendTyping().queue();
                objChan.sendMessage("Than spam").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("because I don’t fucking spam anymore").queue();
                varUnique[50] = 0;
            } else if (!botOrNot && chances == 938 && varUnique[51] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’d rather die than be a spamming piece of shit").queue();
                varUnique[51] = 0;
            } else if (!botOrNot && chances == 937 && varUnique[52] == 1) {
                objChan.sendTyping().completeAfter(5, TimeUnit.SECONDS);
                objChan.sendMessage("Alright fucking listen, every goddamn time I join here there is usually some joke thrown against me. And while it may be funny to you, to say the least I’m not a fan. And using the Thaine gif over and over reminds me of the bullshit I went through with mahdi, and past bullshit with this server. So yeah, that’s why it fucking pisses me the fuck of to see that shit posted everywhere. It shouldn’t even be on this goddamn server.").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Let it fucking die").queue();
                varUnique[52] = 0;
            } else if (!botOrNot && chances == 936 && varUnique[53] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Why the fuck is there stupid fucking shit like that.").queue();
                varUnique[53] = 0;
            } else if (!botOrNot && chances == 935 && varUnique[54] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("“Thaine be like: I’m so fucking important”").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What the fuck kind of retarded shit is that").queue();
                varUnique[54] = 0;
                irr++;
            } else if (!botOrNot && chances == 934 && varUnique[55] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Why the fuck is there stupid fucking shit like that.").queue();
                varUnique[55] = 0;
                irr++;
            } else if (!botOrNot && chances == 933 && varUnique[56] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("That's a dick move").queue();
                varUnique[56] = 0;
            } else if (!botOrNot && chances == 932 && varUnique[57] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("See why I don’t like this shit server?").queue();
                varUnique[57] = 0;
            } else if (!botOrNot && chances == 931 && varUnique[58] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Christ you people are fucking sad.").queue();
                varUnique[58] = 0;
                irr++;
            } else if (!botOrNot && chances == 930 && varUnique[59] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What the shit").queue();
                varUnique[59] = 0;
            } else if (!botOrNot && chances == 929 && varUnique[60] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("pedophilac faggots").queue();
                varUnique[60] = 0;
            } else if (!botOrNot && chances == 928 && varUnique[61] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Who gives a fuck anymore").queue();
                varUnique[61] = 0;
            } else if (!botOrNot && chances == 927 && varUnique[62] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("We should all just end our lives if life has no point").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("If there is no purpose why not end our pointless existence?").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I question life everyday").queue();
                varUnique[62] = 0;
            } else if (!botOrNot && chances == 926 && varUnique[63] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Why the fuck are people basing their name on mine?").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("For example @Th4in3_Kr4m3r @J3ss_Kr4m3r @R33c3_Kr4m3r").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("What the fuck is this about ?").queue();
                varUnique[63] = 0;
            } else if (!botOrNot && chances == 925 && varUnique[64] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I simply don’t wanna piss anyone off").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Turns out I fucking failed in that regard").queue();
                varUnique[64] = 0;
            } else if (!botOrNot && chances == 924 && varUnique[65] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("*loads revolver*").queue();
                varUnique[65] = 0;
            } else if (!botOrNot && chances == 923 && varUnique[66] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("TLJ made me wanna die").queue();
                varUnique[66] = 0;
            } else if (!botOrNot && chances == 922 && varUnique[67] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I nearly spit my fucking drink").queue();
                varUnique[67] = 0;
            } else if (!botOrNot && chances == 921 && varUnique[68] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’m sorry").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("https://cdn.discordapp.com/attachments/529436411724562444/574583728437723137/video.mov").queue();
                varUnique[68] = 0;
            } else if (!botOrNot && chances == 901 && varUnique[68] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I have no idea what’s happening").queue();
                varUnique[68] = 0;
            } else if (!botOrNot && chances == 920 && varUnique[69] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Shize").queue();
                objChan.sendMessage("NEIN").queue();
                varUnique[69] = 0;
            } else if (!botOrNot && chances == 919 && varUnique[70] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("When the caffeine hits").queue();
                objChan.sendMessage("https://media.discordapp.net/attachments/529436411724562444/574579150686257162/image0.jpg?width=503&height=670").queue();
                varUnique[70] = 0;
            } else if (!botOrNot && chances == 918 && varUnique[71] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Eating a Mc muffin rn").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("https://media.discordapp.net/attachments/529436411724562444/574578242908979216/image0.jpg?width=503&height=670").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("It’s fucking delicious").queue();
                varUnique[71] = 0;
            } else if (!botOrNot && chances == 917 && varUnique[72] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Finally got to church").queue();
                objChan.sendMessage("https://media.discordapp.net/attachments/529436411724562444/574574620230025216/image0.jpg?width=503&height=670").queue();
                varUnique[72] = 0;
            } else if (!botOrNot && chances == 916 && varUnique[73] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("THIS SERVER IS FUCKING AIDS").queue();
                varUnique[73] = 0;
                irr++;
            } else if (!botOrNot && chances == 915 && varUnique[74] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I wanna fucking die").queue();
                varUnique[74] = 0;
                irr++;
            } else if (!botOrNot && chances == 914 && varUnique[75] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Yeah no I’m not sexually attracted to feet").queue();
                varUnique[75] = 0;
            } else if (!botOrNot && chances == 913 && varUnique[76] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("*Humanity is fucked*").queue();
                varUnique[76] = 0;
            } else if (!botOrNot && chances == 912 && varUnique[77] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("*Communism intensifies*").queue();
                varUnique[77] = 0;
            } else if (!botOrNot && chances == 911 && varUnique[78] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("*Pure agony*").queue();
                varUnique[78] = 0;
            } else if (!botOrNot && chances == 910 && varUnique[79] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Brie Larson makes me wanna commit neck rope").queue();
                varUnique[79] = 0;
            } else if (!botOrNot && chances == 909 && varUnique[80] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I shit you not").queue();
                varUnique[80] = 0;
            } else if (!botOrNot && chances == 908 && varUnique[81] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("https://media.discordapp.net/attachments/529436411724562444/573629797247352863/image0.png?width=378&height=671").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Should I?").queue();
                varUnique[81] = 0;
            } else if (!botOrNot && chances == 907 && varUnique[82] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Internet is shit, plus I’m in church").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("I’ll talk to you later").queue();
                varUnique[82] = 0;
            } else if (!botOrNot && chances == 906 && varUnique[83] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Imagine dual wielding these").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("https://media.discordapp.net/attachments/529436411724562444/570978892131729419/image0.png?width=378&height=671").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("You’d probably brake both of your arms with a single shot").queue();
                varUnique[83] = 0;
            } else if (!botOrNot && chances == 905 && varUnique[84] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("https://images-ext-2.discordapp.net/external/z9Y774DIHQ6ZdDFwggWIn8Qj-fNKSa8Uk5zZsVfWkc4/%3Fcb%3D20150302131432/https/vignette.wikia.nocookie.net/fistful-of-frags-weapon-stats/images/d/d7/Fof_Schofield.jpg/revision/latest?width=1443&height=582").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Damn").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Thicc gun").queue();
                varUnique[84] = 0;
            } else if (!botOrNot && chances == 904 && varUnique[85] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("You may think I’m a moron, but I’m not. I’ve learned a lot from my past fuck ups.").queue();
                varUnique[85] = 0;
            } else if (!botOrNot && chances == 903 && varUnique[86] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("My internet is fucking shit").queue();
                varUnique[86] = 0;
            } else if (!botOrNot && chances == 902 && varUnique[87] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("https://cdn.discordapp.com/attachments/444538774219653121/521251067959443456/image0.png").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("That’s Noam isn’t it").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("GOD FUCKING DAMMIT").queue();
                irr++;
                varUnique[87] = 0;
            } else if (!botOrNot && chances == 901 && varUnique[88] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Who gives a fuck anymore").queue();
                varUnique[88] = 0;
            } else if (!botOrNot && chances == 899 && varUnique[90] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("Fuck Noam").queue();
                irr++;
                varUnique[90] = 0;
            } else if (!botOrNot && chances == 898 && varUnique[91] == 1) {
                objChan.sendTyping().queue();
                objChan.sendMessage("It’s retarded, not true").queue();
                irr++;
                varUnique[91] = 0;
            }else if (!botOrNot && chances == 897 && varUnique[92] == 1) {
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("Hey Logan Paul").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("you can suck my cock").queue();
                objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                objChan.sendMessage("and feel my balls").queue();
                varUnique[92] = 0;
            }else if (!botOrNot && chances == 896 && varUnique[93] == 1) {
                objChan.sendMessage("Still have cunty people like Jason there?").queue();
                varUnique[93] = 0;
            } else if (!botOrNot && (chances >= 555 && chances <= 610)) {
                objMsg.addReaction(":HappyThaine:579711063327768586").queue();
            } else if (!botOrNot && (chances >= 611 && chances <= 614)) {
                int p = randomUniqueNumbers(arrayPromotion, promotion--);
                if (p == 1) {
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("https://youtu.be/rnMrZOZyL_w").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("I wanted to share a video with you. One I just posted").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("I didn’t see any of you guys comment").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().queue();
                    objGuild.getTextChannelById("469037281903247360").sendMessage("XD").queue();
                }
                if (p == 2) {
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("https://youtu.be/rnMrZOZyL_w").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("New video is up if you’re interested").queue();
                }
                if (p == 3) {
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("https://youtu.be/rnMrZOZyL_w").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("I finished and published a new video today, if you're interested. I understand completely if you're busy or tired").queue();
                }
                if (p == 4) {
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("https://youtu.be/rnMrZOZyL_w").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("Just wanted to say I got a new video up").queue();
                }
                if (p == 5) {
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("What did ya think of my new video?").queue();
                    objGuild.getTextChannelById("469037281903247360").sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objGuild.getTextChannelById("469037281903247360").sendMessage("Yours was awesome btw").queue();
                }
                if (promotion == 0) {
                    promotion = 5;
                    for (int i = 0; i < arrayPromotion.length; i++)
                        arrayPromotion[i] = i + 1; }
            }
            if (irr > 20) {
                int lea = randomUniqueNumbers(arrayLeave, leave--);
                if (lea == 1) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("I’m done").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I’m actually fucking done").queue();
                } else if (lea == 2) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("Fuck that horseshit").queue();
                } else if (lea == 3) {
                    objChan.sendTyping().completeAfter(4, TimeUnit.SECONDS);
                    objChan.sendMessage("Don’t expect me back there for some time").queue();
                } else if (lea == 4) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("You know what fuck this ").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("I’m actually fucking done").queue();
                } else if (lea == 5) {
                    objChan.sendTyping().completeAfter(3, TimeUnit.SECONDS);
                    objChan.sendMessage("I just need a break, so I don’t end up with a broken hand").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Or a bashed in nose").queue();
                } else if (lea == 6) {
                    objChan.sendTyping().queue();
                    objChan.sendMessage("I can’t deal with that dramatic petty bullshit anymore").queue();
                } else if (lea == 7) {
                    objChan.sendTyping().completeAfter(2, TimeUnit.SECONDS);
                    objChan.sendMessage("You know what, I don’t have time to deal with this retarded bullshit.").queue();
                } else if (lea == 8) {
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Im not coming back").queue();
                    objChan.sendTyping().queue();
                    objChan.sendMessage("NEVER").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("Don’t try to convince me otherwise").queue();
                    objChan.sendTyping().completeAfter(1, TimeUnit.SECONDS);
                    objChan.sendMessage("IM FUCKING DONE").queue(); }
                if (lea == 0) {
                    leave = 8;
                    for (int z = 0; z < arrayLeave.length; z++)
                        arrayLeave[z] = z + 1; }
                for (int i = 0; i < varUnique.length; i++){
                    varUnique[i] = 1; }
                irr = 0;
                event.getGuild().leave().complete();}
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
