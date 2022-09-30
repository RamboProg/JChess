package model;

import java.awt.Point;

public abstract class Piece {
  private Type type; //Black or White
  private boolean state; //Dead or Alive
  private Point location; //where the coords are stored

  public Piece(Type type) {
    this.type = type;
    this.state = true;
  }

  public Point getLocation() {
    return this.location;
  }

  public void setLocation(Point l) {
    this.location.x = l.x;
    this.location.y = l.y;
  }

  public Type getType() {
    return this.type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public boolean isState() {
    return this.state;
  }

  public boolean getState() {
    return this.state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public void move() {
    if (getType() == Type.WHITE) this.location.y++; else this.location.y--;
  }

  public void attack(Point victimLoc) {
    this.location = victimLoc;
  }
  //   public int getActionPt() {
  //     return this.actionPt;
  //   }

  //   public void setActionPt(int actionPt) {
  //     this.actionPt = actionPt;
  //   }
}
