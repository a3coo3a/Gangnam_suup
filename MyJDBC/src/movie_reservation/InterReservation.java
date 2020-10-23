package movie_reservation;

public interface InterReservation {
	public int insertRes(ResVO vo);
	public int updateRes(ResVO vo);
	public int deleteRes(ResVO vo);
	public void selectRes(ResVO vo);
}
