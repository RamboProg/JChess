package model;

import java.awt.Point;

public class Knight extends Piece {
  private Point location;

  public Knight(Type type) {
    super(type);
    setLocation(location);
  }

  private void moveRightUp() {
    if (getType() == Type.WHITE) {
      this.location.x++;
      this.location.y += 2;
    } else {
      this.location.x--;
      this.location.y -= 2;
    }
  }

  private void moveLeftUp() {
    if (getType() == Type.WHITE) {
      this.location.x--;
      this.location.y += 2;
    } else {
      this.location.x++;
      this.location.y -= 2;
    }
  }

  private void moveRightDown() {
    if (getType() == Type.WHITE) {
      this.location.x++;
      this.location.y -= 2;
    } else {
      this.location.x--;
      this.location.y += 2;
    }
  }

  private void moveLeftDown() {
    if (getType() == Type.WHITE) {
      this.location.x--;
      this.location.y -= 2;
    } else {
      this.location.x--;
      this.location.y += 2;
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
