package Chess;

public class King extends Piece {
    public King(Pos p, int s) {
        this.pos = p;
        this.side = s;
        if (this.side == 1) {
            this.type = 12;
        } else {
            this.type = 6;
        }
        this.isDead = false;
        this.firstMove = true;
    }

    @Override
    public void move() {
        Map.clearAvailable();
        if (side == 0) {
            Map.available[pos.y][pos.x] = true;
            if (pos.y - 1 > -1) {
                if (Map.map[pos.y - 1][pos.x] == 0 || Map.map[pos.y - 1][pos.x] > 6) {
                    Map.available[pos.y - 1][pos.x] = true;
                }
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y - 1][pos.x - 1] == 0 || Map.map[pos.y - 1][pos.x - 1] > 6) {
                        Map.available[pos.y - 1][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y - 1][pos.x + 1] == 0 || Map.map[pos.y - 1][pos.x + 1] > 6) {
                        Map.available[pos.y - 1][pos.x + 1] = true;
                    }
                }
            }
            if (pos.y + 1 < 8) {
                if (Map.map[pos.y + 1][pos.x] == 0 || Map.map[pos.y + 1][pos.x] > 6) {
                    Map.available[pos.y + 1][pos.x] = true;
                }
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y + 1][pos.x - 1] == 0 || Map.map[pos.y + 1][pos.x - 1] > 6) {
                        Map.available[pos.y + 1][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y + 1][pos.x + 1] == 0 || Map.map[pos.y + 1][pos.x + 1] > 6) {
                        Map.available[pos.y + 1][pos.x + 1] = true;
                    }
                }
            }

            if (pos.x - 1 > -1) {
                if (Map.map[pos.y][pos.x - 1] == 0 || Map.map[pos.y][pos.x - 1] > 6) {
                    Map.available[pos.y][pos.x - 1] = true;
                }
            }
            if (pos.x + 1 < 8) {
                if (Map.map[pos.y][pos.x+1] == 0 || Map.map[pos.y][pos.x+1] > 6) {
                    Map.available[pos.y][pos.x + 1] = true;
                }
            }
        }else{
            Map.available[pos.y][pos.x] = true;
            if (pos.y - 1 > -1) {
                if (Map.map[pos.y - 1][pos.x] == 0 || Map.map[pos.y - 1][pos.x] < 7) {
                    Map.available[pos.y - 1][pos.x] = true;
                }
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y - 1][pos.x - 1] == 0 || Map.map[pos.y - 1][pos.x - 1] < 7) {
                        Map.available[pos.y - 1][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y - 1][pos.x + 1] == 0 || Map.map[pos.y - 1][pos.x + 1] < 7) {
                        Map.available[pos.y - 1][pos.x + 1] = true;
                    }
                }
            }
            if (pos.y + 1 < 8) {
                if (Map.map[pos.y + 1][pos.x] == 0 || Map.map[pos.y + 1][pos.x] < 7) {
                    Map.available[pos.y + 1][pos.x] = true;
                }
                if (pos.x - 1 > -1) {
                    if (Map.map[pos.y + 1][pos.x - 1] == 0 || Map.map[pos.y + 1][pos.x - 1] < 7) {
                        Map.available[pos.y + 1][pos.x - 1] = true;
                    }
                }
                if (pos.x + 1 < 8) {
                    if (Map.map[pos.y + 1][pos.x + 1] == 0 || Map.map[pos.y + 1][pos.x + 1] < 7) {
                        Map.available[pos.y + 1][pos.x + 1] = true;
                    }
                }
            }

            if (pos.x - 1 > -1) {
                if (Map.map[pos.y][pos.x - 1] == 0 || Map.map[pos.y][pos.x - 1] < 7) {
                    Map.available[pos.y][pos.x - 1] = true;
                }
            }
            if (pos.x + 1 < 8) {
                if (Map.map[pos.y][pos.x+1] == 0 || Map.map[pos.y][pos.x+1] < 7) {
                    Map.available[pos.y][pos.x + 1] = true;
                }
            }
        }
    }
}
