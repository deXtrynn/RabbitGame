package Comp1112.ThirdComp1112Project;


import java.util.Scanner;

public class RabbitGamePart2 {

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
            int playeri2 = random(s);
            int playerj2 = (int) (Math.random() * (2 * playeri2 - 1) + 1);

            playerMove(s, helllocationj,
                    helllocationi, heavenlocationi, rats1locationj, rats2locationi,
                    rats2locationj, rabbit1locationi, rabbit1locationj, rabbit2locationi, rabbit2locationj,
                    rabbit3locationi, rabbit3locationj, playeri, playerj, playeri2, playerj2, rats1locationi, heavenlocationj);

        }
    }

    public static int playerMove(int s, int helllocationj,
            int helllocationi, int heavenlocationi, int rats1locationj, int rats2locationi,
            int rats2locationj, int rabbit1locationi, int rabbit1locationj, int rabbit2locationi, int rabbit2locationj,
            int rabbit3locationi, int rabbit3locationj, int playeri, int playerj, int playeri2, int playerj2, int rats1locationi, int heavenlocationj) {
        Scanner scan = new Scanner(System.in);
        int[] pl1 = new int[4];
        int[] pl2 = new int[4];
        int ratseatcarrot = 1;
        int heaveninfo = 1;

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
                || rats2locationi == rabbit2locationi && rats2locationj == rabbit2locationj || rats2locationi == rabbit3locationi && rats2locationj == rabbit3locationj || playeri2 == helllocationi && playerj2 == helllocationj
                || playeri2 == heavenlocationi && playerj2 == heavenlocationj || rats1locationi == playeri2 && rats1locationj == playerj2 || rats2locationi == playeri2 && rats2locationj == playerj2
                || rabbit1locationi == playeri2 && rabbit1locationj == playerj2 || rabbit2locationi == playeri2 && rabbit2locationj == playerj2 || rabbit3locationi == playeri2 && rabbit3locationj == playerj2) {

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

        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

        while ((playeri != helllocationi || playerj != helllocationj)
                && (playeri != heavenlocationi || playerj != heavenlocationj)
                && (playeri2 != helllocationi || playerj2 != helllocationj)
                && (playeri2 != heavenlocationi || playerj2 != heavenlocationj)) {
            System.out.println("Player 1 turn ");
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
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri % 2 == 0 && playerj % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl1[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1]++;
                                System.out.println("Your new carrot number : " + pl1[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }

                        if (playeri == rabbit1locationi && playerj == rabbit1locationj || playeri == rabbit2locationi && playerj == rabbit2locationj
                                || playeri == rabbit3locationi && playerj == rabbit3locationj) {
                            System.out.println("The rabbit came");
                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl1[1] < random) {
                                if (pl1[0] >= 2) {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl1[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl1[0]);
                                    pl1[1] *= random * 0;
                                    System.out.println("Your have " + pl1[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl1[0]);
                                }
                            } else {
                                pl1[2]++;
                                System.out.println("You have " + pl1[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl1[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl1[1]);

                            }
                        }
                        if (playeri == rats1locationi && playerj == rats1locationj || playeri == rats2locationi && playerj == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl1[1] < ratseatcarrot) {

                                if (pl1[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    pl1[0] *= pl1[1] * 0;
                                    System.out.println("Your score is: " + pl1[0]);
                                } else {

                                    pl1[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl1[0]);
                                    System.out.println("You have " + pl1[1] + " carrot");
                                }

                            } else {
                                pl1[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl1[0] += 5;
                                pl1[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                System.out.println("You have " + pl1[1] + " carrot");
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
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri % 2 == 0 && playerj % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl1[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1]++;
                                System.out.println("Your new carrot number : " + pl1[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri == rabbit1locationi && playerj == rabbit1locationj || playeri == rabbit2locationi && playerj == rabbit2locationj
                                || playeri == rabbit3locationi && playerj == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl1[1] < random) {
                                if (pl1[0] >= 2) {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl1[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl1[0]);
                                    pl1[1] *= random * 0;
                                    System.out.println("Your have " + pl1[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl1[0]);
                                }
                            } else {
                                pl1[2]++;
                                System.out.println("You have " + pl1[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl1[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl1[1]);
                            }
                        }
                        if (playeri == rats1locationi && playerj == rats1locationj || playeri == rats2locationi && playerj == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl1[1] < ratseatcarrot) {

                                if (pl1[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    pl1[0] *= pl1[1] * 0;
                                    System.out.println("Your score is: " + pl1[0]);
                                } else {
                                    pl1[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl1[0]);
                                    System.out.println("You have " + pl1[1] + " carrot");
                                }

                            } else {
                                pl1[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl1[0] += 5;
                                pl1[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                System.out.println("You have " + pl1[1] + " carrot");
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
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri % 2 == 0 && playerj % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl1[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1]++;
                                System.out.println("Your new carrot number : " + pl1[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri == rabbit1locationi && playerj == rabbit1locationj || playeri == rabbit2locationi && playerj == rabbit2locationj
                                || playeri == rabbit3locationi && playerj == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl1[1] < random) {
                                if (pl1[0] >= 2) {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl1[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl1[0]);
                                    pl1[1] *= random * 0;
                                    System.out.println("Your have " + pl1[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl1[0]);
                                }
                            } else {
                                pl1[2]++;
                                System.out.println("You have " + pl1[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl1[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl1[1]);
                            }
                        }
                        if (playeri == rats1locationi && playerj == rats1locationj || playeri == rats2locationi && playerj == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl1[1] < ratseatcarrot) {

                                if (pl1[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    pl1[0] *= pl1[1] * 0;
                                    System.out.println("Your score is: " + pl1[0]);
                                } else {
                                    pl1[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl1[0]);
                                    System.out.println("You have " + pl1[1] + " carrot");
                                }

                            } else {
                                pl1[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl1[0] += 5;
                                pl1[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                System.out.println("You have " + pl1[1] + " carrot");
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
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri % 2 == 0 && playerj % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl1[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1]++;
                                System.out.println("Your new carrot number : " + pl1[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri == rabbit1locationi && playerj == rabbit1locationj || playeri == rabbit2locationi && playerj == rabbit2locationj
                                || playeri == rabbit3locationi && playerj == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl1[1] < random) {
                                if (pl1[0] >= 2) {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl1[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl1[0]);
                                    pl1[1] *= random * 0;
                                    System.out.println("Your have " + pl1[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl1[0]);
                                }
                            } else {
                                pl1[2]++;
                                System.out.println("You have " + pl1[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl1[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                pl1[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl1[1]);
                            }
                        }
                        if (playeri == rats1locationi && playerj == rats1locationj || playeri == rats2locationi && playerj == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl1[1] < ratseatcarrot) {

                                if (pl1[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl1[1] + " carrot");
                                    pl1[0] *= pl1[1] * 0;
                                    System.out.println("Your score is: " + pl1[0]);
                                } else {
                                    pl1[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl1[0]);
                                    System.out.println("You have " + pl1[1] + " carrot");
                                }

                            } else {
                                pl1[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl1[0] += 5;
                                pl1[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl1[0]);
                                System.out.println("You have " + pl1[1] + " carrot");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit the game.");
                    System.exit(0);
                default:
                    System.out.println("Invalid value. Please enter a valid value.");
                    break;
            }
            if (playeri == helllocationi && playerj == helllocationj || playeri == heavenlocationi && playerj == heavenlocationj) {
                continue;
            }
            System.out.println("Player 2 turn ");
            System.out.println("[8]: up, [2]: down, [6]: right, [4]: left, [0]Exit game");
            int move2 = scan.nextInt();
            if (heaveninfo % 5 == 0) {
                System.out.println("Heaven is at row : " + heavenlocationi);
            }
            switch (move2) {
                case 8:
                    heaveninfo++;
                    if (playerj2 == 1 || playerj2 == 2 * playeri2 - 1) {
                        System.out.println("You can't move up");
                    } else {
                        playeri2--;
                        playerj2--;
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri2 % 2 == 0 && playerj % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl2[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1]++;
                                System.out.println("Your new carrot number : " + pl2[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }

                        if (playeri2 == rabbit1locationi && playerj2 == rabbit1locationj || playeri2 == rabbit2locationi && playerj2 == rabbit2locationj
                                || playeri2 == rabbit3locationi && playerj2 == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl2[1] < random) {
                                if (pl2[0] >= 2) {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl2[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl2[0]);
                                    pl2[1] *= random * 0;
                                    System.out.println("Your have " + pl2[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl2[0]);
                                }
                            } else {
                                pl2[2]++;
                                System.out.println("You have " + pl2[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl2[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl2[1]);

                            }
                        }
                        if (playeri2 == rats1locationi && playerj2 == rats1locationj || playeri2 == rats2locationi && playerj2 == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl2[1] < ratseatcarrot) {

                                if (pl2[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    pl2[0] *= pl2[1] * 0;
                                    System.out.println("Your score is: " + pl2[0]);
                                } else {
                                    pl2[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl2[0]);
                                    System.out.println("You have " + pl2[1] + " carrot");
                                }

                            } else {
                                pl2[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl2[0] += 5;
                                pl2[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                System.out.println("You have " + pl2[1] + " carrot");
                            }
                        }
                    }
                    break;

                case 2:
                    heaveninfo++;

                    if (playeri2 == s) {
                        System.out.println("You can't move down.");
                    } else {
                        playeri2++;
                        playerj2++;
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri2 % 2 == 0 && playerj2 % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl2[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1]++;
                                System.out.println("Your new carrot number : " + pl2[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri2 == rabbit1locationi && playerj2 == rabbit1locationj || playeri2 == rabbit2locationi && playerj2 == rabbit2locationj
                                || playeri2 == rabbit3locationi && playerj2 == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl2[1] < random) {
                                if (pl2[0] >= 2) {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl2[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl2[0]);
                                    pl2[1] *= random * 0;
                                    System.out.println("Your have " + pl2[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl2[0]);
                                }
                            } else {
                                pl2[2]++;
                                System.out.println("You have " + pl2[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl2[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl2[1]);
                            }
                        }
                        if (playeri2 == rats1locationi && playerj2 == rats1locationj || playeri2 == rats2locationi && playerj2 == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl2[1] < ratseatcarrot) {

                                if (pl2[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    pl2[0] *= pl2[1] * 0;
                                    System.out.println("Your score is: " + pl2[0]);
                                } else {
                                    pl2[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl2[0]);
                                    System.out.println("You have " + pl2[1] + " carrot");
                                }

                            } else {
                                pl2[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl2[0] += 5;
                                pl2[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                System.out.println("You have " + pl2[1] + " carrot");
                            }
                        }
                    }
                    break;
                case 6:
                    heaveninfo++;

                    if (playerj2 == (2 * playeri2 - 1)) {
                        System.out.println("You can't move right.");
                    } else {
                        playerj2++;
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri2 % 2 == 0 && playerj2 % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl2[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1]++;
                                System.out.println("Your new carrot number : " + pl2[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri2 == rabbit1locationi && playerj2 == rabbit1locationj || playeri2 == rabbit2locationi && playerj2 == rabbit2locationj
                                || playeri2 == rabbit3locationi && playerj2 == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl2[1] < random) {
                                if (pl2[0] >= 2) {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl2[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl2[0]);
                                    pl2[1] *= random * 0;
                                    System.out.println("Your have " + pl2[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl2[0]);
                                }
                            } else {
                                pl2[2]++;
                                System.out.println("You have " + pl2[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl2[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl2[1]);
                            }
                        }
                        if (playeri2 == rats1locationi && playerj2 == rats1locationj || playeri2 == rats2locationi && playerj2 == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl2[1] < ratseatcarrot) {

                                if (pl2[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    pl2[0] *= pl2[1] * 0;
                                    System.out.println("Your score is: " + pl2[0]);
                                } else {
                                    pl2[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl2[0]);
                                    System.out.println("You have " + pl2[1] + " carrot");
                                }

                            } else {
                                pl2[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl2[0] += 5;
                                pl2[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                System.out.println("You have " + pl2[1] + " carrot");
                            }
                        }
                    }
                    break;

                case 4:
                    heaveninfo++;

                    if (playerj2 == 1) {
                        System.out.println("You can't move left.");
                    } else {
                        playerj2--;
                        PlayerLocation(playeri, playerj, s, playeri2, playerj2);

                        if (playeri2 % 2 == 0 && playerj2 % 2 == 0) {
                            System.out.println("If you answer the question correctly you will win carrots.");
                            if (question()) {
                                System.out.println("-----------------");
                                System.out.println("You won the carrot");
                                pl2[0] += 10;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1]++;
                                System.out.println("Your new carrot number : " + pl2[1]);
                                System.out.println("-----------------");
                            } else {
                                System.out.println("-----------------");
                                System.out.println("You didin't earn the carrot");
                                System.out.println("-----------------");
                            }
                        }
                        if (playeri2 == rabbit1locationi && playerj2 == rabbit1locationj || playeri2 == rabbit2locationi && playerj2 == rabbit2locationj
                                || playeri2 == rabbit3locationi && playerj2 == rabbit3locationj) {
                            System.out.println("The rabbit came");

                            int random = (int) (Math.random() * 2 + 1);
                            System.out.println("Rabbit wants to eat " + random + " carrots");
                            System.out.println("-----------------");
                            if (pl2[1] < random) {
                                if (pl2[0] >= 2) {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    pl2[0] -= 2;
                                    System.out.println("-----------------");
                                    System.out.println("Your new score is: " + pl2[0]);
                                    pl2[1] *= random * 0;
                                    System.out.println("Your have " + pl2[1] + " carrot");
                                } else {
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    System.out.println("You don't have enough carrots, you lost 2 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("Your score is: " + pl2[0]);
                                }
                            } else {
                                pl2[2]++;
                                System.out.println("You have " + pl2[1] + " carrot");
                                System.out.println("You earned 2 points because you had enough carrots");
                                pl2[0] += 2;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                pl2[1] -= random;
                                System.out.println("Number of remaining carrots : " + pl2[1]);
                            }
                        }
                        if (playeri2 == rats1locationi && playerj2 == rats1locationj || playeri2 == rats2locationi && playerj2 == rats2locationj) {

                            System.out.println("The rats came");
                            System.out.println("Rats eat 1 carrot");
                            System.out.println("-----------------");
                            if (pl2[1] < ratseatcarrot) {

                                if (pl2[0] < 5) {
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("Score cannot be negative");
                                    System.out.println("-----------------");
                                    System.out.println("You have " + pl2[1] + " carrot");
                                    pl2[0] *= pl2[1] * 0;
                                    System.out.println("Your score is: " + pl2[0]);
                                } else {
                                    pl2[0] -= 5;
                                    System.out.println("You don't have enough carrots, you lost 5 points");
                                    System.out.println("-----------------");
                                    System.out.println("Your score is: " + pl2[0]);
                                    System.out.println("You have " + pl2[1] + " carrot");
                                }

                            } else {
                                pl2[3]++;
                                System.out.println("You earned 5 points because you had enough carrots");
                                pl2[0] += 5;
                                pl2[1]--;
                                System.out.println("-----------------");
                                System.out.println("Your new score is: " + pl2[0]);
                                System.out.println("You have " + pl2[1] + " carrot");
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

        if (playeri == helllocationi && playerj == helllocationj || playeri2 == helllocationi && playerj2 == helllocationj) {
            System.out.println("You went to hell");
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
            System.out.println("-----------------");
            if (playeri == helllocationi && playerj == helllocationj) {
                System.out.println("Player2 WON");
            } else if (playeri2 == helllocationi && playerj2 == helllocationj) {
                System.out.println("Player1 WON");
            }
        }
        if (playeri == heavenlocationi && playerj == heavenlocationj || playeri2 == heavenlocationi && playerj2 == heavenlocationj) {
            System.out.println("You went to heaven");
            System.out.println("-----------------");
            System.out.println("Player1 score is : " + pl1[0]);
            System.out.println("Player2 score is : " + pl2[0]);
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
            System.out.println("-----------------");

            findCarrotCollector(pl1, pl2);
            System.out.println("-----------------");
            findRatVisitor(pl1, pl2);
            System.out.println("-----------------");
            findRabbitFeeder(pl1, pl2);
            System.out.println("-----------------");
            findWinner(playeri, playerj, helllocationi,
                    helllocationj, playeri2, playerj2, heavenlocationj, heavenlocationi, pl1, pl2);
        }
        return s;
    }

    public static void findCarrotCollector(int[] pl1, int[] pl2) {
        if (pl1[1] > pl2[1]) {
            System.out.println("Player1 has the most carrot");
            System.out.println("Player1 has a " + pl1[1] + " carrot");
            System.out.println("Player2 has a " + pl2[1] + " carrot");
        } else if (pl1[1] < pl2[1]) {
            System.out.println("Player2 has the most carrot");
            System.out.println("Player1 has a " + pl1[1] + " carrot");
            System.out.println("Player2 has a " + pl2[1] + " carrot");
        } else {
            System.out.println("Player1 and Player2 has equal number of carrots");
            System.out.println("Player1 has a " + pl1[1] + " carrot");
            System.out.println("Player2 has a " + pl2[1] + " carrot");
        }
    }

    public static void findRatVisitor(int[] pl1, int[] pl2) {
        if (pl1[3] > pl2[3]) {
            System.out.println("Player1 has the most rast feeder");
            System.out.println("Player1 has a " + pl1[3] + " rats feeder");
            System.out.println("Player2 has a " + pl2[3] + " rats feeder");
        } else if (pl1[3] < pl2[3]) {
            System.out.println("Player2 has the most rast feeder");
            System.out.println("Player1 has a " + pl1[3] + " rats feeder");
            System.out.println("Player2 has a " + pl2[3] + " rats feeder");
        } else {
            System.out.println("Player1 and Player2 has equal number of rast feeder");
            System.out.println("Player1 has a " + pl1[3] + " rats feeder");
            System.out.println("Player2 has a " + pl2[3] + " rats feeder");
        }
    }

    public static void findRabbitFeeder(int[] pl1, int[] pl2) {
        if (pl1[2] > pl2[2]) {
            System.out.println("Player1 has the most rabbit feeder");
            System.out.println("Player1 has a " + pl1[2] + " rabbit feeder");
            System.out.println("Player2 has a " + pl2[2] + " rabbit feeder");
        } else if (pl1[2] < pl2[2]) {
            System.out.println("Player2 has the most rabbit feeder");
            System.out.println("Player1 has a " + pl1[2] + " rabbit feeder");
            System.out.println("Player2 has a " + pl2[2] + " rabbit feeder");
        } else {
            System.out.println("Player1 and Player2 has equal number of rabbit feeder");
            System.out.println("Player1 has a " + pl1[2] + " rabbit feeder");
            System.out.println("Player2 has a " + pl2[2] + " rabbit feeder");
        }
    }

    public static void findWinner(int playeri, int playerj, int helllocationi,
            int helllocationj, int playeri2, int playerj2, int heavenlocationj, int heavenlocationi, int[] pl1, int[] pl2) {
        if (playeri == heavenlocationi && playerj == heavenlocationj || playeri2 == heavenlocationi && playerj2 == heavenlocationj) {
            if (pl1[0] > pl2[0]) {
                System.out.println("Player1 WON");
            } else if (pl1[0] < pl2[0]) {
                System.out.println("Player2 WON");
            } else {
                System.out.println("DRAW");
            }
        }

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

    public static void PlayerLocation(int playeri, int playerj, int s, int playeri2, int playerj2) {
        for (int i = 1; i <= s; i++) {
            for (int space = 0; space < s - i; space++) {
                System.out.print("      ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == playeri && j == playerj) {
                    System.out.print("[ P1 ]");
                } else if (i == playeri2 && j == playerj2) {
                    System.out.print("[ P2 ]");
                } else {
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        System.out.println("Player1 location is : " + " [" + playeri + "," + playerj + "]");
        System.out.println("Player2 location is : " + " [" + playeri2 + "," + playerj2 + "]");
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
