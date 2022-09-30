package model;

import java.awt.Point;

public class Pawn extends Piece {
  private Point location;

  public Pawn(Type type) {
    super(type);
    setLocation(this.location);
  }

  public void chooseEnhancements() {
    //TO-DO Figure how to switch
  }
}
