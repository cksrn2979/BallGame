
public class VerticalMoveStrategy extends DirectionStrategy {

	public void move(Ball ball) {
		ball.setIntervals(0, Ball.INTERVAL);
		while (true) {
			ball.setY(ball.getY() + ball.getYinterval());			
			if ((ball.getY() < 0 && ball.getYinterval() < 0)
					|| (ball.getY() + Ball.SIZE > BallFrame.HEIGHT -50 && ball.getYinterval() > 0)) {
				ball.setIntervals(0, -ball.getYinterval());
			}
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}

}
