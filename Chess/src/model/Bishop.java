package model;

import java.awt.Point;

public class Bishop extends Piece {
  private Point location;

  public Bishop(Type type) {
    super(type);
  }

  private void moveRightUp() {
    if (getType() == Type.WHITE) {
      this.location.x++;
      this.location.y++;
    } else {
      this.location.x--;
      this.location.y--;
    }
  }

  private void moveLeftUp() {
    if (getType() == Type.WHITE) {
      this.location.x--;
      this.location.y++;
    } else {
      this.location.x++;
      this.location.y--;
    }
  }

  private void moveRightDown() {
    if (getType() == Type.WHITE) {
      this.location.x++;
      this.location.y--;
    } else {
      this.location.x--;
      this.location.y++;
    }
  }

  private void moveLeftDown() {
    if (getType() == Type.WHITE) {
      this.location.x--;
      this.location.y--;
    } else {
      this.location.x--;
      this.location.y++;
    }
  }

  public void move(DirectionX dX, DirectionY dY) {
    if (dX == DirectionX.RIGHT && dY == DirectionY.UP) moveRightUp(); else if (
      dX == DirectionX.RIGHT && dY == DirectionY.DOWN
    ) moveRightDown(); else if (
      dX == DirectionX.LEFT && dY == DirectionY.UP
    ) moveLeftUp(); else moveLeftDown();
  }
}
