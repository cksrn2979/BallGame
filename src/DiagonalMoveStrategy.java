
public class DiagonalMoveStrategy extends DirectionStrategy {

	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
		
		while (true) {
			ball.setY(ball.getY() + ball.getYinterval());
			ball.setX(ball.getX() + ball.getXinterval());
			if ((ball.getY() < 0 && ball.getYinterval() < 0)
					|| (ball.getY() + Ball.SIZE > BallFrame.HEIGHT -50 && ball.getYinterval() > 0)) {
				ball.setIntervals(ball.getXinterval(), -ball.getYinterval());
			}
			if ((ball.getX() < 0 && ball.getXinterval() < 0)
					|| (ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() > 0)) {
				ball.setIntervals(-ball.getXinterval(), ball.getYinterval());
			}	
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}

}
