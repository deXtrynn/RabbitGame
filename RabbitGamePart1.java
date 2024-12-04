package Comp1112.ThirdComp1112Project;


import java.util.Scanner;

public class RabbitGamePart1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the s value");
        int s = scan.nextInt();
        if (s < 1) {
            while (s < 1) {
                System.out.println("Enter the invalid value");
                System.out.println("Enter the s value");
                s = scan.nextInt();
            }
        } else {
            playerMove(s);
        }
    }

    public static int playerMove(int s) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int carrotnum = 0;
        int ratseatcarrot = 1;
        int heaveninfo = 1;
        int helllocationi = random(s);
        int helllocationj = (int) (Math.random() * (2 * helllocationi - 1) + 1);
        int heavenlocationi = random(s);
        int heavenlocationj = (int) (Math.random() * (2 * heavenlocationi - 1) + 1);

        int rats1locationi = random(s);
        int rats1locationj = (int) (Math.random() * (2 * rats1locationi - 1) + 1);
        int rats2locationi = random(s);
        int rats2locationj = (int) (Math.random() * (2 * rats2locationi - 1) + 1);

        int rabbit1locationi = random(s);
        int rabbit1locationj = (int) (Math.random() * (2 * rabbit1locationi - 1) + 1);
        int rabbit2locationi = random(s);
        int rabbit2locationj = (int) (Math.random() * (2 * rabbit2locationi - 1) + 1);
        int rabbit3locationi = random(s);
        int rabbit3locationj = (int) (Math.random() * (2 * rabbit3locationi - 1) + 1);

        int playeri = random(s);
        int playerj = (int) (Math.random() * (2 * playeri - 1) + 1);

        while (helllocationi == heavenlocationi && helllocationj == heavenlocationj
                || helllocationi % 2 == 0 && helllocationj % 2 == 0 || heavenlocationi % 2 == 0 && heavenlocationj % 2 == 0
                || playeri == helllocationi && playerj == helllocationj
                || playeri == heavenlocationi && playerj == heavenlocationj || rats1locationi == rats2locationi && rats1locationj == rats2locationj
                || rats1locationi % 2 == 0 && rats1locationj % 2 == 0 || rats2locationi % 2 == 0 && rats2locationj % 2 == 0 || rabbit1locationi == rabbit2locationi && rabbit1locationj == rabbit2locationj
                || rabbit1locationi == rabbit3locationi && rabbit1locationj == rabbit3locationj
                || rabbit2locationi == rabbit3locationi && rabbit2locationj == rabbit3locationj
                || rabbit1locationi % 2 == 0 && rabbit1locationj % 2 == 0 || rabbit2locationi % 2 == 0 && rabbit2locationj % 2 == 0
                || rabbit3locationi % 2 == 0 && rabbit3locationj % 2 == 0 || rats1locationi == playeri && rats1locationj == playerj || rats2locationi == playeri && rats2locationj == playerj
                || rabbit1locationi == playeri && rabbit1locationj == playerj || rabbit2locationi == playeri && rabbit2locationj == playerj || rabbit3locationi == playeri && rabbit3locationj == playerj
                || rabbit1locationi == helllocationi && rabbit1locationj == helllocationj || rabbit2locationi == helllocationi && rabbit2locationj == helllocationj
                || rabbit3locationi == helllocationi && rabbit3locationj == helllocationj || rabbit1locationi == heavenlocationi && rabbit1locationj == heavenlocationj
                || rabbit2locationi == heavenlocationi && rabbit2locationj == heavenlocationj || rabbit3locationi == heavenlocationi && rabbit3locationj == heavenlocationj
                || rats1locationi == helllocationi && rats1locationj == helllocationj || rats2locationi == helllocationi && rats2locationj == helllocationj
                || rats1locationi == heavenlocationi && rats1locationj == heavenlocationj || rats2locationi == heavenlocationi && rats2locationj == heavenlocationj
                || rats1locationi == rabbit1locationi && rats1locationj == rabbit1locationj || rats1locationi == rabbit2locationi && rats1locationj == rabbit2locationj
                || rats1locationi == rabbit3locationi && rats1locationj == rabbit3locationj || rats2locationi == rabbit1locationi && rats2locationj == rabbit1locationj
                || rats2locationi == rabbit2locationi && rats2locationj == rabbit2locationj || rats2locationi == rabbit3locationi && rats2locationj == rabbit3locationj) {

            helllocationi = random(s);
            helllocationj = (int) (Math.random() * (2 * helllocationi - 1) + 1);
            heavenlocationi = random(s);
            heavenlocationj = (int) (Math.random() * (2 * heavenlocationi - 1) + 1);

            rats1locationi = random(s);
            rats1locationj = (int) (Math.random() * (2 * rats1locationi - 1) + 1);
            rats2locationi = random(s);
            rats2locationj = (int) (Math.random() * (2 * rats2locationi - 1) + 1);

            rabbit1locationi = random(s);
            rabbit1locationj = (int) (Math.random() * (2 * rabbit1locationi - 1) + 1);
            rabbit2locationi = random(s);
            rabbit2locationj = (int) (Math.random() * (2 * rabbit2locationi - 1) + 1);
            rabbit3locationi = random(s);
            rabbit3locationj = (int) (Math.random() * (2 * rabbit3locationi - 1) + 1);
        }
        PlayerLocation(playeri, playerj, s);

        while (hellandheaven(helllocationi, helllocationj, heavenlocationi, heavenlocationj, playeri, playerj, s)) {
            System.out.println("[8]: up, [2]: down, [6]: right, [4]: left, [0]Exit game");
            int move = scan.nextInt();
            if (heaveninfo % 5 == 0) {
                System.out.println("Heaven is at row : " + heavenlocationi);
            }
            switch (move) {
                case 8:
                    heaveninfo++;
                    if (playerj == 1 || playerj == 2 * playeri - 1) {
                        System.out.println("You can't move up");
                    } else {
                        playeri--;
                        playerj--;
                        PlayerLocation(playeri, playerj, s);

                        if (isThereACarrot(playeri, playerj)) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                score += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum++;
                                System.out.println("Your new carrot number : " + carrotnum);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }

                        if (isThereARabit(rabbit1locationi, rabbit1locationj, rabbit2locationi, rabbit2locationj,
                                rabbit3locationi, rabbit3locationj, playeri, playerj, s)) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 5 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (carrotnum < random) {
                                if (score >= 2) {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    score -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + score);
                                    carrotnum *= random * 0;
                                    System.out.println("Your have " + carrotnum + " carrot");
                                } else {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + score);
                                }
                            } else {
                                System.out.println("You have " + carrotnum + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                score += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum -= random;
                                System.out.println("Number of remaining carrots : " + carrotnum);

                            }
                        }
                        if (isThereARat(rats1locationi, rats1locationj, rats2locationi, rats2locationj, playeri, playerj, s)) {
                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (carrotnum < ratseatcarrot) {

                                if (score < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + carrotnum + " carrot");
                                    score *= carrotnum * 0;
                                    System.out.println("Your score is: " + score);
                                } else {
                                    score -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + score);
                                    System.out.println("You have " + carrotnum + " carrot");
                                }

                            } else {
                                System.out.println("You earned 5 points because you had enough carrots");
                                score += 5;
                                carrotnum--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                System.out.println("You have " + carrotnum + " carrot");
                            }
                        }
                    }
                    break;

                case 2:
                    heaveninfo++;

                    if (playeri == s) {
                        System.out.println("You can't move down.");
                    } else {
                        playeri++;
                        playerj++;
                        PlayerLocation(playeri, playerj, s);

                        if (isThereACarrot(playeri, playerj)) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                score += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum++;
                                System.out.println("Your new carrot number : " + carrotnum);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (isThereARabit(rabbit1locationi, rabbit1locationj, rabbit2locationi, rabbit2locationj,
                                rabbit3locationi, rabbit3locationj, playeri, playerj, s)) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 5 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (carrotnum < random) {
                                if (score >= 2) {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    score -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + score);
                                    carrotnum *= random * 0;
                                    System.out.println("Your have " + carrotnum + " carrot");
                                } else {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + score);
                                }
                            } else {
                                System.out.println("You have " + carrotnum + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                score += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum -= random;
                                System.out.println("Number of remaining carrots : " + carrotnum);
                            }
                        }
                        if (isThereARat(rats1locationi, rats1locationj, rats2locationi, rats2locationj, playeri, playerj, s)) {
                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (carrotnum < ratseatcarrot) {

                                if (score < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + carrotnum + " carrot");
                                    score *= carrotnum * 0;
                                    System.out.println("Your score is: " + score);
                                } else {
                                    score -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + score);
                                    System.out.println("You have " + carrotnum + " carrot");
                                }

                            } else {
                                System.out.println("You earned 5 points because you had enough carrots");
                                score += 5;
                                carrotnum--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                System.out.println("You have " + carrotnum + " carrot");
                            }
                        }
                    }
                    break;
                case 6:
                    heaveninfo++;

                    if (playerj == (2 * playeri - 1)) {
                        System.out.println("You can't move right.");
                    } else {
                        playerj++;
                        PlayerLocation(playeri, playerj, s);

                        if (isThereACarrot(playeri, playerj)) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                score += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum++;
                                System.out.println("Your new carrot number : " + carrotnum);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (isThereARabit(rabbit1locationi, rabbit1locationj, rabbit2locationi, rabbit2locationj,
                                rabbit3locationi, rabbit3locationj, playeri, playerj, s)) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 5 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (carrotnum < random) {
                                if (score >= 2) {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    score -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + score);
                                    carrotnum *= random * 0;
                                    System.out.println("Your have " + carrotnum + " carrot");
                                } else {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + score);
                                }
                            } else {
                                System.out.println("You have " + carrotnum + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                score += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum -= random;
                                System.out.println("Number of remaining carrots : " + carrotnum);
                            }
                        }
                        if (isThereARat(rats1locationi, rats1locationj, rats2locationi, rats2locationj, playeri, playerj, s)) {
                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (carrotnum < ratseatcarrot) {

                                if (score < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + carrotnum + " carrot");
                                    score *= carrotnum * 0;
                                    System.out.println("Your score is: " + score);
                                } else {
                                    score -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + score);
                                    System.out.println("You have " + carrotnum + " carrot");
                                }

                            } else {
                                System.out.println("You earned 5 points because you had enough carrots");
                                score += 5;
                                carrotnum--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                System.out.println("You have " + carrotnum + " carrot");
                            }
                        }
                    }
                    break;

                case 4:
                    heaveninfo++;

                    if (playerj == 1) {
                        System.out.println("You can't move left.");
                    } else {
                        playerj--;
                        PlayerLocation(playeri, playerj, s);

                        if (isThereACarrot(playeri, playerj)) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                score += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum++;
                                System.out.println("Your new carrot number : " + carrotnum);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (isThereARabit(rabbit1locationi, rabbit1locationj, rabbit2locationi, rabbit2locationj,
                                rabbit3locationi, rabbit3locationj, playeri, playerj, s)) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 5 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (carrotnum < random) {
                                if (score >= 2) {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    score -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + score);
                                    carrotnum *= random * 0;
                                    System.out.println("Your have " + carrotnum + " carrot");
                                } else {
                                    System.out.println("You have " + carrotnum + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + score);
                                }
                            } else {
                                System.out.println("You have " + carrotnum + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                score += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                carrotnum -= random;
                                System.out.println("Number of remaining carrots : " + carrotnum);
                            }
                        }
                        if (isThereARat(rats1locationi, rats1locationj, rats2locationi, rats2locationj, playeri, playerj, s)) {
                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (carrotnum < ratseatcarrot) {

                                if (score < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + carrotnum + " carrot");
                                    score *= carrotnum * 0;
                                    System.out.println("Your score is: " + score);
                                } else {
                                    score -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + score);
                                    System.out.println("You have " + carrotnum + " carrot");
                                }

                            } else {
                                System.out.println("You earned 5 points because you had enough carrots");
                                score += 5;
                                carrotnum--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + score);
                                System.out.println("You have " + carrotnum + " carrot");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit the game.");
                    System.exit(0);
                default:
                    System.out.println("Invalid value. Please enter a valid value.");
            }

        }
        if (playeri == helllocationi && playerj == helllocationj) {
            System.out.println("You went to hell");
            System.out.println("You lost the game");
            System.out.println("Your score is : 0");
            System.out.println("-----------------");
            System.out.println("Hell location is : " + " [" + helllocationi + "," + helllocationj + "]");
            System.out.println("Heaven location is : " + " [" + heavenlocationi + "," + heavenlocationj + "]");
            System.out.println("-----------------");
            System.out.println("Rats 1 location is : " + " [" + rats1locationi + "," + rats1locationj + "]");
            System.out.println("Rats 2 location is : " + " [" + rats2locationi + "," + rats2locationj + "]");
            System.out.println("-----------------");
            System.out.println("Rabbit 1 location is : " + " [" + rabbit1locationi + "," + rabbit1locationj + "]");
            System.out.println("Rabbit 2 location is : " + " [" + rabbit2locationi + "," + rabbit2locationj + "]");
            System.out.println("Rabbit 3 location is : " + " [" + rabbit3locationi + "," + rabbit3locationj + "]");
            System.out.println("-----------------");
            carrot(s, playeri, playerj);
        } else {
            System.out.println("You went to heaven");
            System.out.println("You won the game");
            System.out.println("Score is : " + score);
            System.out.println("You won " + carrotnum + " carrots");
            System.out.println("-----------------");
            System.out.println("Hell location is : " + " [" + helllocationi + "," + helllocationj + "]");
            System.out.println("Heaven location is : " + " [" + heavenlocationi + "," + heavenlocationj + "]");
            System.out.println("-----------------");
            System.out.println("Rats 1 location is : " + " [" + rats1locationi + "," + rats1locationj + "]");
            System.out.println("Rats 2 location is : " + " [" + rats2locationi + "," + rats2locationj + "]");
            System.out.println("-----------------");
            System.out.println("Rabbit 1 location is : " + " [" + rabbit1locationi + "," + rabbit1locationj + "]");
            System.out.println("Rabbit 2 location is : " + " [" + rabbit2locationi + "," + rabbit2locationj + "]");
            System.out.println("Rabbit 3 location is : " + " [" + rabbit3locationi + "," + rabbit3locationj + "]");
            System.out.println("-----------------");
            carrot(s, playeri, playerj);
        }
        return s;
    }

    public static void table(int s) {
        for (int i = 1; i <= s; i++) {
            for (int space = 0; space < s - i; space++) {
                System.out.print("     ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("[" + i + "," + j + "]");
            }
            System.out.println("");
        }
    }

    public static int random(int s) {
        return (int) (Math.random() * s + 1);
    }

    public static boolean isThereACarrot(int playeri, int playerj) {
        return playeri % 2 == 0 && playerj % 2 == 0;
    }

    public static boolean hellandheaven(int helllocationi, int helllocationj, int heavenlocationi,
            int heavenlocationj, int playeri, int playerj, int s) {
        return (playeri != helllocationi || playerj != helllocationj) && (playeri != heavenlocationi || playerj != heavenlocationj);

    }

    public static boolean isThereARat(int rats1locationi, int rats1locationj, int rats2locationi,
            int rats2locationj, int playeri, int playerj, int s) {
        return playeri == rats1locationi && playerj == rats1locationj || playeri == rats2locationi && playerj == rats2locationj;
    }

    public static boolean isThereARabit(int rabbit1locationi, int rabbit1locationj, int rabbit2locationi,
            int rabbit2locationj, int rabbit3locationi, int rabbit3locationj, int playeri, int playerj, int s) {
        return playeri == rabbit1locationi && playerj == rabbit1locationj || playeri == rabbit2locationi && playerj == rabbit2locationj
                || playeri == rabbit3locationi && playerj == rabbit3locationj;
    }

    public static void carrot(int s, int playeri, int playerj) {
        int counter = 1;
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.println("Carrot " + counter + " location is : " + " [" + i + "," + j + "]");
                    counter++;

                }
            }
        }

    }

    public static void PlayerLocation(int playeri, int playerj, int s) {
        for (int i = 1; i <= s; i++) {
            for (int space = 0; space < s - i; space++) {
                System.out.print("      ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == playeri && j == playerj) {
                    System.out.print("[ L ] ");
                } else {
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        System.out.println("Player location is : " + " [" + playeri + "," + playerj + "]");
        System.out.println("-----------------");
    }

    public static boolean question() {
        Scanner scan = new Scanner(System.in);
        int rndnum1 = (int) (Math.random() * 10 + 1);
        int rndnum2 = (int) (Math.random() * 10 + 1);
        int rndoperator = (int) (Math.random() * 4);
        boolean mainanswer = false;
        switch (rndoperator) {
            case 0:
                System.out.print(rndnum1 + "+" + rndnum2 + " = ");
                int answer1 = scan.nextInt();
                int result1 = rndnum1 + rndnum2;
                mainanswer = (result1 == answer1);
                break;
            case 1:
                System.out.print(rndnum1 + "-" + rndnum2 + " = ");
                int answer2 = scan.nextInt();
                int result2 = rndnum1 - rndnum2;
                mainanswer = (result2 == answer2);
                break;
            case 2:
                System.out.print(rndnum1 + "*" + rndnum2 + " = ");
                int answer3 = scan.nextInt();
                int result3 = rndnum1 * rndnum2;
                mainanswer = (result3 == answer3);
                break;
            case 3:
                System.out.print(rndnum1 + "/" + rndnum2 + " = ");
                int answer4 = scan.nextInt();
                int result4 = rndnum1 / rndnum2;
                mainanswer = (result4 == answer4);
                break;
        }
        return mainanswer;
    }

}
