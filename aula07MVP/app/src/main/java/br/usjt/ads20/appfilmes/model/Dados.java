package br.usjt.ads20.appfilmes.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Dados {


    private static ArrayList<Hero> heroes;

    public static void setHerois(ArrayList<Hero> pHeroes) {
        heroes = pHeroes;
    }

    public static Hero[] callHeroes(String chave) {

        ArrayList<Hero> lista = heroes;
        ArrayList<Hero> filtro;
        Hero[] heroesList;

        if (chave == null || chave.length() == 0) {
            filtro = lista;
        } else {

            filtro = new ArrayList<>();
            for (Hero hero : lista) {

                String nome = hero.getTitulo();
                if (nome.toUpperCase().contains(chave.toUpperCase())) {
                    filtro.add(hero);
                }
            }
        }

        heroesList = filtro.toArray(new Hero[0]);
        Arrays.sort(heroesList);
        return heroesList;
    }

    public static ArrayList<Hero> makeHero() {
        ArrayList<Hero> lista = new ArrayList<>();
        Hero hero;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        hero = new Hero();
        hero.setPosterPath("adversary1.png");
        hero.setBackdropPath("adversary1.png");
        hero.setTitulo("Adversary");
        hero.setDescricao("The Adversary is an ancient mystical entity, possibly demonic in nature, who seeks to destroy the present universe and to create a new one " +
                "in its stead. The Cheyenne Indians also refer to the Adversary as the 'Great Trickster', " +
                "for the Adversary uses deception and trickery in attempting to achieve his goals. His native dimension is one of chaos, " +
                "which the Adversary loves and seeks to spread to Earth's dimension, overturning order for the mere sake of doing so. The Adversary regards himself as a " +
                "gamester, toying with the fate of the cosmos for sheer enjoyment. In his true form, the Adversary is not composed of physical matter; hence he can be fought successfully through magic " +
                "but not through most forms of physical force. The Adversary is, however, known to be vulnerable to harm by cold iron, and hence to both steel and Adamantium.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("agentx1.png");
        hero.setBackdropPath("agentx1.png");
        hero.setTitulo("Agent X");
        hero.setDescricao("Originally a partner of the mind-altering assassin Black Swan, Nijo spied on Deadpool as part of the Swan's plan to exact revenge for Deadpool falsely taking credit for the Swan's " +
                "assassination of the Four Winds crime family, which included Nijo's brother. Nijo was killed by the Swan after refusing to kill Deadpool's assistant, Sandi Brandenberg. Confronted by Deadpool, " +
                "the Swan's powers flared out of control, telepathically linking their minds and mixing traits and abilities before the bomb detonated. Now sharing Deadpool's healing factor, Nijo was resurrected, but with " +
                "no memory of his identity or past except for a burning ambition to become the world's best mercenary. He instinctively sought out Sandi, who took him in due to his resemblance to Deadpool. He named himself " +
                "Alex Hayden after the composers Alexander Grieg and Josef Haydn, Sandi " +
                "enlisted the help of her mercenary boyfriend Taskmaster and the gunslinger Outlaw for Hayden's training, creating within him a combination of Deadpool's and the Swan's skills.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("Amphibion1.png");
        hero.setBackdropPath("Amphibion1.png");
        hero.setTitulo("Amphibion");
        hero.setDescricao("Engineered and extensively trained off-world, Qnax is the product of centuries of selective breeding by the Grand Xandarean Council of Elders, intended to be the greatest warrior in the known galaxies. The Council sent Qnax to Watcherworld (home of the cosmic Watchers) to obtain the Ultimate Machine, which accessed the accumulated knowledge of the universe. There he was bested by the Hulk (sent by the Leader to obtain the Machine), who tossed him into orbit. Uatu The Watcher transported Qnax back to Xantares, which had descended into chaos during his years-long journey. The Council told Qnax they had hoped the Machine could restore order to their world. When he questioned them, they branded him a heretic, and exiled him from Xantar.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("antman1.png");
        hero.setBackdropPath("antman1.png");
        hero.setTitulo("Ant Man");
        hero.setDescricao("Desperate to provide for his family, but unable to make ends meet, electronics genius Scott Lang turned to burglary and inadvertently won himself a prison sentence. After being released early for good behavior, he knuckled down to raise his daughter Cassie, though soon discovered nothing had changed with his luck and fortunes. When Cassie fell ill from a devastating heart ailment and her surgeon was abducted by a mysterious wealthy man, Lang reluctantly returned to his life of crime in an effort to save his daughter’s life.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("apocalypse1.png");
        hero.setBackdropPath("apocalypse1.png");
        hero.setTitulo("Apocalypse");
        hero.setDescricao("The man known as En Sabah Nur was one of the earliest mutants on the planet. Twenty years ago, Apocalypse, along with his trusted ally, Sinister, witnessed the first televised proof of the existence of other super-beings when Legion accidentally murdered his father, Charles Xavier. Apocalypse, a strict believer in the survival of the fittest, launched his offensive against humankind. With Xavier dead, and Apocalypse beginning his offensive ten years earlier than he did in the Marvel Universe, there was no one to stand in his way.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("bishop1.png");
        hero.setBackdropPath("bishop1.png");
        hero.setTitulo("Bishop");
        hero.setDescricao("Lucas Bishop was born in the 21st Century A.D. of an alternate future timeline in which the mutant-hunting robot Sentinels had taken control of North America. In this timeline, Professor Charles Xavier and most of the members of the mutant team he founded, the X-Men, had been killed. Surviving mutants were hunted down and either killed or imprisoned within relocation camps.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("blackpanther1.png");
        hero.setBackdropPath("blackpanther1.png");
        hero.setTitulo("Black Panther");
        hero.setDescricao("For generations, the people of Wakanda have followed the Black Panther, a superior warrior granted extra abilities upon proving himself worthy. For much of the modern era, T’Challa has worn the mantle of the Black Panther.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("captainomen1.png");
        hero.setBackdropPath("captainomen1.png");
        hero.setTitulo("Captain Omen");
        hero.setDescricao("In a mad scheme to claim all of Earth's ocean floors, and essentially three-quarters of the Earth itself, Captain Omen dubbed himself master of a massive self-sustaining ship called Infra-World" +
                "The Hulk, already engaged in battle with a submarine, soon found himself captive of Captain Omen and his strange crew. The brute did not fully understand his situation and attempted to escape, but with nowhere to go coupled with his inability to breathe underwater, the Hulk was easily hunted down and recaptured by Omen's men riding atop of mythical Toad-Whales. As the Hulk was left in a decompression chamber to recover, Captain Omen was startled to see his transformation into his alter-ego, Bruce Banner. Feeling Banner would be able to appreciate Infra-World's wonder, Captain Omen gave him a tour of the ship, but when Banner did not share Omen's vision, the Hulk was released again. A brief battle with the captain's workers left Hulk stranded on the ocean floor. Captain Omen gave Hulk a helmet so he can breathe, but he did not allow Hulk back on his ship. Instead, he told Hulk to follow behind the ship and hoped to keep him roaming the ocean floor for the rest of his life.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("colossus1.png");
        hero.setBackdropPath("colossus1.png");
        hero.setTitulo("Colossus");
        hero.setDescricao("Piotr Rasputin was smuggled into the U.S. from Russia at age nine, for his own personal safety as opposed to anything threatening his family, most of whom still live in Russia. After a childhood described as violent and miserable, Rasputin discovered his mutant powers and began earning money by performing feats of super-strength for tourists. He also realized that he was gay. Eventually returning to Russia, he faced death from a Siberian firing squad, but was rescued and recruited by the Red Mafiya (the Russian Mafia). Not a criminal by nature but unable to resist the attractive profits, Piotr became an arms dealer and sent almost all his earnings to his family. When an arms merchant employed by Magneto's Brotherhood of Mutants double-crossed him during a transaction, Piotr exposed himself as a mutant by assuming metallic form to repel his attacker's bullets. In the aftermath of the battle, Jean Grey, who was tracking down potential X-Men, came upon the scene and recruited Piotr. As Colossus, Piotr proved an exceptional combatant against X-Men foes such as the Sentinels and Magneto's Brotherhood of Mutants, and he developed a crush on fellow recruit Wolverine.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("destroyer1.png");
        hero.setBackdropPath("destroyer1.png");
        hero.setTitulo("Destroyer");
        hero.setDescricao("Accompanying his friend Brian Falsworth to Nazi Germany just prior to the outbreak of World War II, Roger Aubrey became a captive of the Reich upon war breaking out. He was subjected to experiments conducted by Colonel Dietrich, and was shrunk to a height of 12 inches. Brainwashed, he returned to the U.K. as Dyna-Mite, to become a member of the Crusaders, a group of Allied superheroes who each unwittingly owed their powers to the Nazis; unknown to the team, their ally Alfie was a German agent, and the group had been formed with the intention of discrediting the Invaders and assassinating King George VI. After encountering that other team of heroes, Alfie's villainy was exposed by Roger, and the evil plan was thwarted. Colonel Dietrich was subsequently captured and forced to reverse the process which shrank Roger; Aubrey then took on the new identity of the Destroyer (recently abandoned by Brian Falsworth), and went behind enemy lines to continue the fight. At some point he was exposed to the variant of the super-soldier serum which had enhanced Brian's physical prowess, which would retard his aging and keep him fighting fit for decades after the end of the war. At some point, he and Brian became lovers.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("exodus1.png");
        hero.setBackdropPath("exodus1.png");
        hero.setTitulo("Exodus");
        hero.setDescricao("Since he was first sighted by the government-sponsored incarnation of X-Factor, Exodus, who may have lived for several hundred years, has acted as an unquestioning follower of Magneto and fanatic leader of the Acolytes, a remorseful peacemaker seeking to end the Genoshan civil war and, finally, as the leader of a group of mutant criminals with a grudge against the X-Men. Throughout all of his varied incarnations, Exodus has displayed a fragile psyche, as well as a fundamental disregard for the lives of regular humans. Exodus at one point held his own against the combined forces of the Avengers and the X-Men, in spite of not yet having realized his full potential. Presumed to be one of the most powerful mutants on Earth, Exodus' mental instability and lack of morals make him an unpredictable, extremely dangerous individual.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("hurricane1.png");
        hero.setBackdropPath("hurricane1.png");
        hero.setTitulo("Hurricane");
        hero.setDescricao("When his project on diffusing hurricanes was cancelled, meteorologist Albert Potter piloted an experimental weather control craft into the heart of Hurricane Linda in a desperate bid to prove his theories. His vehicle could partially control the storm, but Potter had drawn the attention of Otherworld’s Nethergods, who sought a pawn to destroy their enemy Merlyn’s champion, Captain Britain; Potter’s craft was struck repeatedly by lightning and exploded. Bathed in strange energies, Potter was transformed. Rescued by a passing ship, he returned to Britain convinced his vehicle had been sabotaged. Abandoning his former life, he spent months in hiding designing a control harness to focus his powers, then attacked London’s Thames University as Hurricane, wishing to test his new abilities against Captain Britain. Potter easily overpowered the novice hero, but Captain Britain subsequently tore off Hurricane’s backpack in a later bout; without its cooling system, the villain violently overheated and was taken into custody.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("kraven1.png");
        hero.setBackdropPath("kraven1.png");
        hero.setTitulo("Kraven");
        hero.setDescricao("Alyosha Kravinoff, a mutant son of the infamous Kraven the Hunter, was - unlike his half-brother Vladimir Kravinoff - shamefully raised in an African jungle separate from his family and civilization due to his illegitimate birth. After Kraven's suicide Alyosha came to New York to understand the father he barely knew. Dressed as Kraven, Alyosha confronted his Uncle Dmitri (the Chameleon). Believing his abusive half-brother had returned from the dead, the Chameleon revealed to Alyosha much about the dysfunctional Kravinoff family. Kraven's former lover, Calypso Ezili, did actually return from the dead, and she mistook Alyosha for Kraven. She seduced Alyosha, but afterwards he spurned her affections. Later, riding a bull elephant atop Manhattan's rooftops, Alyosha attacked Spider-Man, poisoning him with an hallucinogenic dart, but then set him free. While at the Kravinoff's estate, Alyosha was learning about his father from Spider-Man when Calypso returned with Kraven's tribesmen, setting the home ablaze and killing all but one animal, Gulyadkin the lion. Calypso poisoned Alyosha and Spider-Man and used her hypnotic powers to force the two to fight to the death. Spider-Man resisted and injured Calypso, while Alyosha subdued her with his lion. Despite asking for her forgiveness, Alyosha savagely killed Calypso and all the tribesmen.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("ancientone1.png");
        hero.setBackdropPath("ancientone1.png");
        hero.setTitulo("Ancient One");
        hero.setDescricao("The youth who would eventually be called the Ancient One was born over five hundred years ago in Kamar-Taj, a village in a hidden land in the Himalaya Mountains in the area now known as Tibet. Originally, the youth, like the other men of the village, was a peaceful farmer. However, an older fellow villager named Kaluu somehow gained certain magical knowledge, which he shared with the youth. Kaluu and the youth began exploring the secrets of sorcery together, and learned how to harness mystical energy for their own uses. However, their motives were quite different. Kaluu intended to build a vast empire, while the youth wished to use sorcery to benefit his fellow villagers. While the youth continued his studies, Kaluu slowly used his sorcery to influence the villagers' minds. Eventually, Kaluu and the youth together cast a spell that eliminated disease, poverty, and suffering from Kamar-Taj, and granted its people immortality. Shortly thereafter, the people of Kamar-Taj, responding to Kaluu's magical influence on their minds, crowned him as their king. For over a year Kaluu organized the men of Kamar-Taj into an army of conquest, while slowly increasing his magical control over the minds of the people of Kamar-Taj so that they became no more than his placid puppets. The youth attempted to warn the villagers about Kaluu, but Kaluu's magic prevented them from heeding him. Kaluu struck the youth from behind with a mystical bolt which paralyzed him. Then Kaluu had his soldiers conquer a neighboring village and reduce its people to slavery.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("scorpion1.png");
        hero.setBackdropPath("scorpion1.png");
        hero.setTitulo("Scorpion");
        hero.setDescricao("Carmilla Black is a genetically engineered human, created by Advanced Idea Mechanics (A.I.M.). Though A.I.M. Scientist Supreme Monica Rapuccini considers her a daughter, she grew up with adoptive parents, who were also agents of A.I.M., never knowing of her or their involvement with the organization. Carmilla considered herself a normal teen until her latent powers manifested on the night of her prom. Her mutated arm, which she has taken to calling her stinger, discharged a highly concentrated dosage of toxins, killing her boyfriend. Scared of the social and legal backlash she would suffer, she fled her small home town. For years, She lived on the streets, surviving however she could, constantly roaming from place to place. When she learned her adoptive parents had been murdered, she returned home.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("stiltman1.png");
        hero.setBackdropPath("stiltman1.png");
        hero.setTitulo("Stilt Man");
        hero.setDescricao("Wilbur Day was a scientist at Kaxton Labs who stole designs for a hydraulic ramming device from his company out of frustration of his position in his job. He soon invented a battlesuit and tried his hand at petty villainy-- looting stores and robbing pedestrians. Later on, he tried suing the company, with Matt Murdock as his attorney, claiming legal ownership of Kaxton's original design and going so far as to accuse Kaxton of being the Stilt-Man. Eventually, Day was discovered to actually be Stilt-Man. Day, wearing the stilts but not the rest of his armored suit, used an experimental molecular condenser gun, based on another idea of Kaxton's, to attempt to eliminate Daredevil. But in battling Daredevil, Day himself was struck by the molecular condenser's ray and shrank seemingly into nothingness.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("suicide1.png");
        hero.setBackdropPath("suicide1.png");
        hero.setTitulo("Suicide");
        hero.setDescricao("Chris Daniels was down on his luck and contemplating suicide, after his wife Donna informed him that she wanted a divorce, and would taking the kids with her. Unable to take his own life Chris wept in frustration. The Hell-lord, Mephisto offered to give him the courage he sought to take his own life. Chris was skeptical due to Mephisto's reputation of being the lord of lies. Reluctantly Chris accepted the offer, by agreeing to relinquish his soul to Mephisto once he died. The catch of this deal was that there was only one way that Chris could die, it was by the hands of the Ghost Rider (Daniel Ketch). It was the soul of the Ghost Rider that Mephisto truly coveted. Now infuriated at being tricked Chris took on the name of Suicide and headed to Brooklyn in search of the Ghost Rider, to fulfill the bargain.");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("toad1.png");
        hero.setBackdropPath("toad1.png");
        hero.setTitulo("Toad");
        hero.setDescricao("British-born Mortimer Toynbee was abandoned by his parents so early in childhood that he cannot remember them. He was placed in an orphanage where the other children, who regarded him as a freak due to his ugliness, his unusual physique, and his leaping ability, continually tormented him. Toynbee was so traumatized by his loneliness and the continual abuse he received that it affected his learning abilities. The teachers and administrators in the orphanage therefore regarded Toynbee as mentally retarded, even though, in actuality, he was of normal intelligence. So desperate did Toynbee become for affection that he developed a pathetically subservient personality, and would unquestioningly obey anyone he thought sincerely cared about him.");
        lista.add(hero);

        return lista;
    }
}
