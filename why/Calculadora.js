var Chihuahua = {
	name: 'Chihuahua',
	weight: '2',
	picture: 'http://www.vanitytoys.net/wp-content/uploads/2017/08/chihuahua-blanco.jpg'
}

var Schnauzer = {
	name: 'Schnauzer',
	weight: '7',
	picture: 'https://i.ytimg.com/vi/nCleRuOv-qw/hqdefault.jpg'
}

var Poodle = {
	name: 'Poodle',
	weight: '7',
	picture: 'https://mascotafiel.com/wp-content/uploads/2015/09/french-poodle_opt-compressor-1.jpg'
}

var Labrador = {
	name: 'Labrador',
	weight: '32',
	picture: 'https://www.thelabradorsite.com/wp-content/uploads/2011/12/breed-standard.jpg'
}

var Pug = {
	name: 'Pug',
	weight: '7',
	picture: 'http://a.abcnews.com/images/Health/GTY_fat_dog_nt_131107_16x9_992.jpg'
}

var Border = {
	name: 'Border Collie',
	weight: '16',
	picture: 'http://www.rapidfirebordercollies.com/wp-content/uploads/2017/04/bor.jpg'
}

var Corgi = {
	name: 'Corgi',
	weight: '15',
	picture: 'https://vetstreet.brightspotcdn.com/dims4/default/79f1bd2/2147483647/crop/0x0%2B0%2B0/resize/645x380/quality/90/?url=https%3A%2F%2Fvetstreet-brightspot.s3.amazonaws.com%2F83%2F9e8de0a7f411e0a0d50050568d634f%2Ffile%2FPembroke-Welsh-Corgi-3-645mk62711.jpg'
}

var Salchicha = {
	name: 'Salchicha',
	weight: '10',
	picture: 'https://vetstreet-brightspot.s3.amazonaws.com/5b/e6/1dc93ba2496a9d9c3608cba0b41e/Dachshund-AP-08EJPM-645sm101513.jpg'
}

function chooseBreed(){
	if (document.getElementById('change_chart').value == "chi"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Chihuahua.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "sch"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Schnauzer.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "poo"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Poodle.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "lab"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Labrador.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "pug"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Pug.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "bor"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Border.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else if (document.getElementById('change_chart').value == "cor"){
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Corgi.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} else {
		var lol = document.getElementById('img1');
		lol.setAttribute("src", `${Salchicha.picture}`);
		lol.setAttribute("width", "300px");
 		lol.setAttribute("height", "auto");
	} 
}

function calcAlimento(){
	if (document.getElementById('age_chart').value == "1") {
		var peso = document.getElementById("txt").value;
		var resultado = peso * 0.09;
		var n = resultado.toFixed(2);
		respuesta = document.createElement('div');
		respuesta.appendChild(document.createTextNode(`El cachorro debe comer ` + n + ` tazas`));
		respuesta.style.color = "yellow";
		respuesta.style.fontsize = "number";
		respuesta.style.textAlign = "center";
		return document.getElementById("div1").appendChild(respuesta); 
	} else if (document.getElementById('age_chart').value == "2") {
		var peso = document.getElementById("txt").value;
		var resultado = peso * 0.06;
		var n = resultado.toFixed(2);
		respuesta = document.createElement('div');
		respuesta.appendChild(document.createTextNode(`El cachorro debe comer ` + n + ` tazas`));
		respuesta.style.color = "yellow";
		respuesta.style.fontsize = "number";
		respuesta.style.textAlign = "center";
		return document.getElementById("div1").appendChild(respuesta);
	} else if (document.getElementById('age_chart').value == "3") {
		var peso = document.getElementById("txt").value;
		var resultado = peso * 0.05;
		var n = resultado.toFixed(2);
		respuesta = document.createElement('div');
		respuesta.appendChild(document.createTextNode(`El joven debe comer ` + n + ` tazas`));
		respuesta.style.color = "yellow";
		respuesta.style.fontsize = "number";
		respuesta.style.textAlign = "center";
		return document.getElementById("div1").appendChild(respuesta);
	} else {
		var peso = document.getElementById("txt").value;
		var resultado = peso * 0.03;
		var n = resultado.toFixed(2);
		respuesta = document.createElement('div');
		respuesta.appendChild(document.createTextNode(`El adulto debe comer ` + n + ` tazas`));
		respuesta.style.color = "yellow";
		respuesta.style.fontsize = "number";
		respuesta.style.textAlign = "center";
		return document.getElementById("div1").appendChild(respuesta);
	}
}
