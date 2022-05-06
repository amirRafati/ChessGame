package Chess;

public class Queen extends Piece {
    public Queen(Pos p, int s) {
        this.pos = p;
        this.side = s;
        if (this.side == 1) {
            this.type = 11;
        } else {
            this.type = 5;
        }
        this.isDead = false;
        this.firstMove = true;
    }

    @Override
    public void move() {
        Map.clearAvailable();
        if (side == 0) {
            //for every y position until the bottm
            for (int y = pos.y; y < 8; y++) {
                //if there's nothing there or the position is the same
                if (Map.map[y][pos.x] == 0 || y == pos.y) {
                    //it's available
                    Map.available[y][pos.x] = true;
                } else if (Map.map[y][pos.x] != 0) {
                    //otehrwise it's only available if there's an enemy
                    if (Map.map[y][pos.x] > 6) {
                        Map.available[y][pos.x] = true;
                    }
                    break;
                }
            }

            //repeat the same process but moving upwards
            for (int y = pos.y; y > -1; y--) {
                if (Map.map[y][pos.x] == 0 || y == pos.y) {
                    Map.available[y][pos.x] = true;
                } else if (Map.map[y][pos.x] != 0) {
                    if (Map.map[y][pos.x] > 6) {
                        Map.available[y][pos.x] = true;
                    }
                    break;
                }
            }

            //repeat the same process but moving right
            for (int x = pos.x; x < 8; x++) {
                if (Map.map[pos.y][x] == 0 || x == pos.x) {
                    Map.available[pos.y][x] = true;
                } else if (Map.map[pos.y][x] != 0) {
                    if (Map.map[pos.y][x] > 6) {
                        Map.available[pos.y][x] = true;
                    }
                    break;
                }
            }

            //repeat the same process but moving left
            for (int x = pos.x; x > -1; x--) {
                if (Map.map[pos.y][x] == 0 || x == pos.x) {
                    Map.available[pos.y][x] = true;
                } else if (Map.map[pos.y][x] != 0) {
                    if (Map.map[pos.y][x] > 6) {
                        Map.available[pos.y][x] = true;
                    }
                    break;
                }
            }

            //check all bottom-right diagonals
            int offset = 0;
            boolean obstacle = false;
            while (pos.y + offset < 8 && pos.x + offset < 8 && !obstacle) {
                if (Map.map[pos.y + offset][pos.x + offset] == 0 || offset == 0) {
                    Map.available[pos.y + offset][pos.x + offset] = true;
                } else {
                    if (Map.map[pos.y + offset][pos.x + offset] > 6) {
                        Map.available[pos.y + offset][pos.x + offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }

            //check all top-right diagonals
            offset = 0;
            obstacle = false;
            while (pos.y - offset > -1 && pos.x + offset < 8 && !obstacle) {
                if (Map.map[pos.y - offset][pos.x + offset] == 0 || offset == 0) {
                    Map.available[pos.y - offset][pos.x + offset] = true;
                } else {
                    if (Map.map[pos.y - offset][pos.x + offset] > 6) {
                        Map.available[pos.y - offset][pos.x + offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }

            //check all top-left diagonals
            offset = 0;
            obstacle = false;
            while (pos.y - offset > -1 && pos.x - offset > -1 && !obstacle) {
                if (Map.map[pos.y - offset][pos.x - offset] == 0 || offset == 0) {
                    Map.available[pos.y - offset][pos.x - offset] = true;
                } else {
                    if (Map.map[pos.y - offset][pos.x - offset] > 6) {
                        Map.available[pos.y - offset][pos.x - offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }


            //check all bottom-left diagonals
            offset = 0;
            obstacle = false;
            while (pos.y + offset < 8 && pos.x - offset > -1 && !obstacle) {
                if (Map.map[pos.y + offset][pos.x - offset] == 0 || offset == 0) {
                    Map.available[pos.y + offset][pos.x - offset] = true;
                } else {
                    if (Map.map[pos.y + offset][pos.x - offset] > 6) {
                        Map.available[pos.y + offset][pos.x - offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }
        } else {
            for (int y = pos.y; y < 8; y++) {
                if (Map.map[y][pos.x] == 0 || y == pos.y) {
                    Map.available[y][pos.x] = true;
                } else if (Map.map[y][pos.x] != 0) {
                    if (Map.map[y][pos.x] < 7) {
                        Map.available[y][pos.x] = true;
                    }
                    break;
                }
            }

            for (int y = pos.y; y > -1; y--) {
                if (Map.map[y][pos.x] == 0 || y == pos.y) {
                    Map.available[y][pos.x] = true;
                } else if (Map.map[y][pos.x] != 0) {
                    if (Map.map[y][pos.x] < 7) {
                        Map.available[y][pos.x] = true;
                    }
                    break;
                }
            }

            for (int x = pos.x; x < 8; x++) {
                if (Map.map[pos.y][x] == 0 || x == pos.x) {
                    Map.available[pos.y][x] = true;
                } else if (Map.map[pos.y][x] != 0) {
                    if (Map.map[pos.y][x] < 7) {
                        Map.available[pos.y][x] = true;
                    }
                    break;
                }
            }

            for (int x = pos.x; x > -1; x--) {
                if (Map.map[pos.y][x] == 0 || x == pos.x) {
                    Map.available[pos.y][x] = true;
                } else if (Map.map[pos.y][x] != 0) {
                    if (Map.map[pos.y][x] < 7) {
                        Map.available[pos.y][x] = true;
                    }
                    break;
                }
            }

            //check all bottom-right diagonals
            int offset = 0;
            boolean obstacle = false;
            while (pos.y + offset < 8 && pos.x + offset < 8 && !obstacle) {
                if (Map.map[pos.y + offset][pos.x + offset] == 0 || offset == 0) {
                    Map.available[pos.y + offset][pos.x + offset] = true;
                } else {
                    if (Map.map[pos.y + offset][pos.x + offset] < 7) {
                        Map.available[pos.y + offset][pos.x + offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }

            //check all top-right diagonals
            offset = 0;
            obstacle = false;
            while (pos.y - offset > -1 && pos.x + offset < 8 && !obstacle) {
                if (Map.map[pos.y - offset][pos.x + offset] == 0 || offset == 0) {
                    Map.available[pos.y - offset][pos.x + offset] = true;
                } else {
                    if (Map.map[pos.y - offset][pos.x + offset] < 7) {
                        Map.available[pos.y - offset][pos.x + offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }

            //check all top-left diagonals
            offset = 0;
            obstacle = false;
            while (pos.y - offset > -1 && pos.x - offset > -1 && !obstacle) {
                if (Map.map[pos.y - offset][pos.x - offset] == 0 || offset == 0) {
                    Map.available[pos.y - offset][pos.x - offset] = true;
                } else {
                    if (Map.map[pos.y - offset][pos.x - offset] < 7) {
                        Map.available[pos.y - offset][pos.x - offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }


            //check all bottom-left diagonals
            offset = 0;
            obstacle = false;
            while (pos.y + offset < 8 && pos.x - offset > -1 && !obstacle) {
                if (Map.map[pos.y + offset][pos.x - offset] == 0 || offset == 0) {
                    Map.available[pos.y + offset][pos.x - offset] = true;
                } else {
                    if (Map.map[pos.y + offset][pos.x - offset] < 7) {
                        Map.available[pos.y + offset][pos.x - offset] = true;
                    }
                    obstacle = true;
                }
                offset++;
            }
        }
    }
}
