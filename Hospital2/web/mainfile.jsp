<link rel="stylesheet" type="text/css" href="css/dropdown.css">
<style>
body {
background-image: url('images/check.jpg');
background-size:1376px 768px;
background-repeat: no-repeat;
}
</style>
<nav>
    <form action="sendmsg" method="post">
    <input type="hidden" name="dame" value="${requestScope.dame}"/>
    <ul class="nav">
    <li><a>SCALP</a>
      <ul>
        
        <li><a>Anxiety<input type="checkbox" name="scalp" value="anxiety"></a></li>
        <li><a>Swelling<input type="checkbox" name="scalp" value="swelling"></a></li>
        <li><a>HairLoss<input type="checkbox" name="scalp" value="hairloss"></a></li>
		<li><a>Scratching<input type="checkbox" name="scalp" value="scratching"></a></li>
		<li><a>Fever<input type="checkbox" name="scalp" value="fever"></a></li>
        <li><a>Fainting<input type="checkbox" name="scalp" value="fainting"></a></li>
        <li><a>Delusions<input type="checkbox" name="scalp" value="delusions"></a></li>
        <li><a>Bleeding<input type="checkbox" name="scalp" value="bleeding"></a></li>
        <li><a>Confusion<input type="checkbox" name="scalp" value="confusion"></a></li>
		<li><a>HeadAche<input type="checkbox" name="scalp" value="headache"></a></li>
        <li><a>Blackouts<input type="checkbox" name="scalp" value="blackouts"></a></li>
        <li><a>BaldSpots<input type="checkbox" name="scalp" value="baldspots"></a></li>
      </ul>
    </li>
	<li><a>EYES</a>
      <ul>

        <li><a>Blurred<input type="checkbox" name="eyes" value="blurred"></a></li>
        <li><a>Decreased Night Vision<input type="checkbox" name="eyes" value="decreased_night_vision"></a></li>
		<li><a>Irritation<input type="checkbox" name="eyes" value="irritation"></a></li>
        <li><a>Redness<input type="checkbox" name="eyes" value="redness"></a></li>
        <li><a>Burning<input type="checkbox" name="eyes" value="burning"></a></li>
        <li><a>Dryness<input type="checkbox" name="eyes" value="dryness"></a></li>
		<li><a>Mucus<input type="checkbox" name="eyes" value="mucus"></a></li>
        <li><a>Sudden Flash<input type="checkbox" name="eyes" value="sudden_false"></a></li>
        <li><a>Dilated Pupils<input type="checkbox" name="eyes" value="dilated_pupils"></a></li>
		<li><a>Eyelids Falling<input type="checkbox" name="eyes" value="eyelid_falling"></a></li>
        <li><a>Floating Spots<input type="checkbox" name="eyes" value="floating_spots"></a></li>
        <li><a>Shadow<input type="checkbox" name="eyes" value="shadow"></a></li>
      </ul>
    </li>
   
    <li><a>JAW</a>
      <ul>

        <li><a>Bleeding<input type="checkbox" name="jaw" value="bleeding"></a></li>
		<li><a>Broken Bone<input type="checkbox" name="jaw" value="broken_bone"></a></li>
        <li><a>Clicking<input type="checkbox" name="jaw" value="clicking"></a></li>
        <li><a>Swollen Glands<input type="checkbox" name="jaw" value="swollen_glands"></a></li>
		<li><a>Jaw Locking<input type="checkbox" name="jaw" value="jaw_locking"></a></li>
        <li><a>Lump<input type="checkbox" name="jaw" value="lump"></a></li>
        <li><a>Spasms<input type="checkbox" name="jaw" value="spasms"></a></li>
		<li><a>Numbness<input type="checkbox" name="jaw" value="numbness"></a></li>
        <li><a>Pain<input type="checkbox" name="jaw" value="pain"></a></li>
        <li><a>Stiffness<input type="checkbox" name="jaw" value="stiffness"></a></li>
        <li><a>Deformity<input type="checkbox" name="jaw" value="deformity"></a></li>
        <li><a>Warmness<input type="checkbox" name="jaw" value="warmness"></a></li>
      </ul>
    </li>   
    <li><a>NECK</a>
      <ul>

        <li><a>Bleeding<input type="checkbox" name="neck" value="bleeding"></a></li>
        <li><a>Choking<input type="checkbox" name="neck" value="choking"></a></li>
        <li><a>Scars<input type="checkbox" name="neck" value="scars"></a></li>
		<li><a>Cough<input type="checkbox" name="neck" value="cough"></a></li>
        <li><a>Drainage<input type="checkbox" name="neck" value="drainage"></a></li>
        <li><a>Gagging<input type="checkbox" name="neck" value="gagging"></a></li>
		<li><a>Hoarse Voice<input type="checkbox" name="neck" value="hoarse_voice"></a></li>
        <li><a>Itching<input type="checkbox" name="neck" value="itching"></a></li>
        <li><a>Lump<input type="checkbox" name="neck" value="lump"></a></li>
		<li><a>Bruises<input type="checkbox" name="neck" value="bruises"></a></li>
        <li><a>Tonsils<input type="checkbox" name="neck" value="tonsils"></a></li>
        <li><a>Stiffness<input type="checkbox" name="neck" value="stiffness"></a></li>
      </ul>
    </li>
	<li><a>CHEST</a>
      <ul>
        
        <li><a>Cough<input type="checkbox" name="chest" value="cough"></a></li>
        <li><a>Difficulty Breathing<input type="checkbox" name="chest" value="difficulty_breathing"></a></li>
		<li><a>Heartburn<input type="checkbox" name="chest" value="heartburn"></a></li>
		<li><a>Hyperventilating<input type="checkbox" name="chest" value="hyperventilating"></a></li>
        <li><a>Bruises<input type="checkbox" name="chest" value="bruises"></a></li>
        <li><a>Cramps<input type="checkbox" name="chest" value="cramps"></a></li>
        <li><a>Asthma<input type="checkbox" name="chest" value="asthma"></a></li>
        <li><a>High Pulserate<input type="checkbox" name="chest" value="high_pulserate"></a></li>
		<li><a>Swelling<input type="checkbox" name="chest" value="swelling"></a></li>
        <li><a>Bleeding<input type="checkbox" name="chest" value="bleeding"></a></li>
        <li><a>Swallowing<input type="checkbox" name="chest" value="swallowing"></a></li>
        <li><a>Muscle Cramps<input type="checkbox" name="chest" value="muscle_cramps"></a></li>
      </ul>
    </li>
    <li><a>ABDOMEN</a>
      <ul>

        <li><a>Bloating<input type="checkbox" name="abdomen" value="bloating"></a></li>
        <li><a>Constipation<input type="checkbox" name="abdomen" value="constipation"></a></li>
		<li><a>Diarrhea<input type="checkbox" name="abdomen" value="dairrhea"></a></li>
        <li><a>Drainage<input type="checkbox" name="abdomen" value="drainage"></a></li>
        <li><a>Lump<input type="checkbox" name="abdomen" value="lump"></a></li>
        <li><a>Bruises<input type="checkbox" name="abdomen" value="bruises"></a></li>
		<li><a>Bowel Movements<input type="checkbox" name="abdomen" value="bowel_movements"></a></li>
        <li><a>Pressure<input type="checkbox" name="abdomen" value="pressure"></a></li>
        <li><a>Swelling<input type="checkbox" name="abdomen" value="swelling"></a></li>
		<li><a>Worms<input type="checkbox" name="abdomen" value="worms"></a></li>
        <li><a>Bulging vein<input type="checkbox" name="abdomen" value="bulging vein"></a></li>
        <li><a>Pulsating Sensation<input type="checkbox" name="abdomen" value="pulsating_sensation"></a></li>
      </ul>
    </li>
	<li><a>THIGH</a>
      <ul>

        <li><a>Warmness<input type="checkbox" name="thigh" value="warmness"></a></li>
        <li><a>Swelling<input type="checkbox" name="thigh" value="swelling"></a></li>
		<li><a>Pain<input type="checkbox" name="thigh" value="pain"></a></li>
        <li><a>Deformity<input type="checkbox" name="thigh" value="deformity"></a></li>
        <li><a>Tenderness<input type="checkbox" name="thigh" value="tenderness"></a></li>
        <li><a>Obesity<input type="checkbox" name="thigh" value="obesity"></a></li>
        <li><a>Drainage<input type="checkbox" name="thigh" value="drainage"></a></li>
        <li><a>Cramps<input type="checkbox" name="thigh" value="cramps"></a></li>
		<li><a>Stiffness<input type="checkbox" name="thigh" value="stiffness"></a></li>
        <li><a>Fracture<input type="checkbox" name="thigh" value="fracture"></a></li>
        <li><a>Lump<input type="checkbox" name="thigh" value="lump"></a></li>
		<li><a>Tingling<input type="checkbox" name="thigh" value="tingling"></a></li>
      </ul>
    </li>
	<li><a>KNEE</a>
      <ul>

		<li><a>Stiffness<input type="checkbox" name="knee" value="stiffness"></a></li>
        <li><a>Joint Pain<input type="checkbox" name="knee" value="joint_pain"></a></li>
        <li><a>Swelling<input type="checkbox" name="knee" value="swelling"></a></li>
        <li><a>Stiffness<input type="checkbox" name="knee" value="stiffness"></a></li>
        <li><a>Inability to move<input type="checkbox" name="knee" value="inability"></a></li>
        <li><a>Discoloration<input type="checkbox" name="knee" value="discoloration"></a></li>
		<li><a>Popping<input type="checkbox" name="knee" value="popping"></a></li>
        <li><a>Decreased Movement<input type="checkbox" name="knee" value="decreased_movement"></a></li>
        <li><a>Drainage<input type="checkbox" name="knee" value="drainage"></a></li>
		<li><a>Puss<input type="checkbox" name="knee" value="puss"></a></li>
        <li><a>Bruises<input type="checkbox" name="knee" value="bruises"></a></li>
        <li><a>Instability<input type="checkbox" name="knee" value="instability"></a></li>
      </ul>
    </li>
	<li><a>FEET</a>
      <ul>
        
        <li><a>Discoloration<input type="checkbox" name="feet" value="discoloration"></a></li>
        <li><a>Instability<input type="checkbox" name="feet" value="instability"></a></li>
		<li><a>Cold feet<input type="checkbox" name="feet" value="cold_feet"></a></li>
        <li><a>Stiffness<input type="checkbox" name="feet" value="stiffness"></a></li>
        <li><a>Lump<input type="checkbox" name="feet" value="lump"></a></li>
		<li><a>BrokenBone<input type="checkbox" name="feet" value="brokenbone"></a></li>
        <li><a>Obesity<input type="checkbox" name="feet" value="obesity"></a></li>
        <li><a>Deformity<input type="checkbox" name="feet" value="deformity"></a></li>
        <li><a>Cramps<input type="checkbox" name="feet" value="cramps"></a></li>
		<li><a>Blue Skin<input type="checkbox" name="feet" value="blue_skin"></a></li>
        <li><a>Difficulty Walking<input type="checkbox" name="feet" value="difficulty_walking"></a></li>
        <li><a>Bruising<input type="checkbox" name="feet" value="bruising"></a></li>
      </ul>
    </li>
	<li><a>TOE</a>
      <ul>
        
        <li><a>Joint Pen<input type="checkbox" name="toe" value="joint_pain"></a></li>
        <li><a>Color Change<input type="checkbox" name="toe" value="color_range"></a></li>
        <li><a>Warmness<input type="checkbox" name="toe" value="warmness"></a></li>
		<li><a>Obesity<input type="checkbox" name="toe" value="obesity"></a></li>
        <li><a>Cramps<input type="checkbox" name="toe" value="cramps"></a></li>
        <li><a>Stiffness<input type="checkbox" name="toe" value="stiffness"></a></li>
		<li><a>Bleeding<input type="checkbox" name="toe" value="bleeding"></a></li>
        <li><a>Fracture<input type="checkbox" name="toe" value="fracture"></a></li>
        <li><a>Swelling<input type="checkbox" name="toe" value="swelling"></a></li>
		<li><a>Bruises<input type="checkbox" name="toe" value="bruises"></a></li>
        <li><a>Puss<input type="checkbox" name="toe" value="puss"></a></li>
        <li><a>Numbness<input type="checkbox" name="toe" value="numbness"></a></li>
      </ul>
    </li>
  </ul>
  <input type="submit" method="post" align="right">
</form>
</nav>