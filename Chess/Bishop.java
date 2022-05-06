package Chess;

public class Bishop extends Piece {
    public Bishop(Pos p, int s) {
        this.pos = p;
        this.side = s;
        if (this.side == 1) {
            this.type = 10;
        } else {
            this.type = 4;
        }
        this.isDead = false;
        this.firstMove = true;
    }

    @Override
    public void move() {
        Map.clearAvailable();
        if (this.side == 0) {
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
        }else{
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
