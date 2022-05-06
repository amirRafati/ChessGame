package Chess;

public class Horse extends Piece {
    public Horse(Pos p, int s) {
        this.pos = p;
        this.side = s;
        if (this.side == 1) {
            this.type = 9;
        } else {
            this.type = 3;
        }
        this.isDead = false;
        this.firstMove = true;
    }

    @Override
    public void move() {
        Map.clearAvailable();
        if (side == 0) {
            if (pos.y - 2 > -1) {
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y - 2][pos.x - 1] == 0 || Map.map[pos.y - 2][pos.x - 1] > 6) {
                        Map.available[pos.y - 2][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y - 2][pos.x + 1] == 0 || Map.map[pos.y - 2][pos.x + 1] > 6) {
                        Map.available[pos.y - 2][pos.x + 1] = true;
                    }
                }
            }

            if (pos.y + 2 < 8) {
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y + 2][pos.x - 1] == 0 || Map.map[pos.y + 2][pos.x - 1] > 6) {
                        Map.available[pos.y + 2][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y + 2][pos.x + 1] == 0 || Map.map[pos.y + 2][pos.x + 1] > 6) {
                        Map.available[pos.y + 2][pos.x + 1] = true;
                    }
                }
            }

            if (pos.y - 1 > -1) {
                if (pos.x - 2 > -1) {
                    if (Map.map[pos.y - 1][pos.x - 2] == 0 || Map.map[pos.y - 1][pos.x - 2] > 6) {
                        Map.available[pos.y - 1][pos.x - 2] = true;
                    }
                }

                if (pos.x + 2 < 8) {
                    if (Map.map[pos.y - 1][pos.x + 2] == 0 || Map.map[pos.y - 1][pos.x + 2] > 6) {
                        Map.available[pos.y - 1][pos.x + 2] = true;
                    }
                }
            }

            if (pos.y + 1 < 8) {
                if (pos.x - 2 > -1) {
                    if (Map.map[pos.y + 1][pos.x - 2] == 0 || Map.map[pos.y + 1][pos.x - 2] > 6) {
                        Map.available[pos.y + 1][pos.x - 2] = true;
                    }
                }
                if (pos.x + 2 < 8) {
                    if (Map.map[pos.y + 1][pos.x + 2] == 0 || Map.map[pos.y + 1][pos.x + 2] > 6) {
                        Map.available[pos.y + 1][pos.x + 2] = true;
                    }
                }
            }
        }else{
            if (pos.y - 2 > -1) {
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y - 2][pos.x - 1] == 0 || Map.map[pos.y - 2][pos.x - 1] < 7) {
                        Map.available[pos.y - 2][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y - 2][pos.x + 1] == 0 || Map.map[pos.y - 2][pos.x + 1] < 7) {
                        Map.available[pos.y - 2][pos.x + 1] = true;
                    }
                }
            }

            if (pos.y + 2 < 8) {
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y + 2][pos.x - 1] == 0 || Map.map[pos.y + 2][pos.x - 1] < 7) {
                        Map.available[pos.y + 2][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y + 2][pos.x + 1] == 0 || Map.map[pos.y + 2][pos.x + 1] < 7) {
                        Map.available[pos.y + 2][pos.x + 1] = true;
                    }
                }
            }

            if (pos.y - 1 > -1) {
                if (pos.x - 2 > -1) {
                    if (Map.map[pos.y - 1][pos.x - 2] == 0 || Map.map[pos.y - 1][pos.x - 2] < 7) {
                        Map.available[pos.y - 1][pos.x - 2] = true;
                    }
                }

                if (pos.x + 2 < 8) {
                    if (Map.map[pos.y - 1][pos.x + 2] == 0 || Map.map[pos.y - 1][pos.x + 2] < 7) {
                        Map.available[pos.y - 1][pos.x + 2] = true;
                    }
                }
            }

            if (pos.y + 1 < 8) {
                if (pos.x - 2 > -1) {
                    if (Map.map[pos.y + 1][pos.x - 2] == 0 || Map.map[pos.y + 1][pos.x - 2] < 7) {
                        Map.available[pos.y + 1][pos.x - 2] = true;
                    }
                }
                if (pos.x + 2 < 8) {
                    if (Map.map[pos.y + 1][pos.x + 2] == 0 || Map.map[pos.y + 1][pos.x + 2] < 7) {
                        Map.available[pos.y + 1][pos.x + 2] = true;
                    }
                }
            }
        }
    }
}
