package org;

import java.util.HashMap;
/**
 * Created by Brandon on 4/4/2017.
 */
public class Dictionary {
  HashMap<String, Entry> stringEntryMap;

  /**
   * Creates a new org.Dictionary object.
   *
   * @param : EntryMap stores a map of possible strings in the application and entry
   * objects that will pair the strings with the given language.
   */
  public Dictionary() {
    /* dictionary definition */
    setupDictionary();
    stringEntryMap = new HashMap<String, Entry>();

    HashMap<Language, String> backLabel = new HashMap<Language, String>();
    backLabel.put(Language.SPANISH, "Espalda");
    backLabel.put(Language.ENGLISH, "Back");
    backLabel.put(Language.PORTUGESE, "Costas");
    Entry e = new Entry(backLabel);
    this.addEntry("Back", e);

    HashMap<Language, String> usernameLabel = new HashMap<Language, String>();
    usernameLabel = new HashMap<Language, String>();
    usernameLabel.put(Language.SPANISH, "Nombre de usuario");
    usernameLabel.put(Language.ENGLISH, "Username");
    usernameLabel.put(Language.PORTUGESE, "Nome de usuário");
    Entry g = new Entry(usernameLabel);
    this.addEntry("Username", g);

    HashMap<Language, String> passwordLabel = new HashMap<Language, String>();
    passwordLabel = new HashMap<Language, String>();
    passwordLabel.put(Language.SPANISH, "Contraseña");
    passwordLabel.put(Language.ENGLISH, "Password");
    passwordLabel.put(Language.PORTUGESE, "Palavra-passe");
    Entry password = new Entry(passwordLabel);
    this.addEntry("Password", password);

    HashMap<Language, String> mapLabel = new HashMap<Language, String>();
    mapLabel = new HashMap<Language, String>();
    mapLabel.put(Language.SPANISH, "Mapa");
    mapLabel.put(Language.ENGLISH, "Map");
    mapLabel.put(Language.PORTUGESE, "Mapa");
    Entry map = new Entry(mapLabel);
    this.addEntry("Map", map);

    HashMap<Language, String> loginLabel = new HashMap<Language, String>();
    loginLabel = new HashMap<Language, String>();
    loginLabel.put(Language.SPANISH, "iniciar sesión");
    loginLabel.put(Language.ENGLISH, "Login");
    loginLabel.put(Language.PORTUGESE, "iniciar sessão");
    Entry login = new Entry(loginLabel);
    this.addEntry("Login", login);

    HashMap<Language, String> searchLabel = new HashMap<Language, String>();
    searchLabel = new HashMap<Language, String>();
    searchLabel.put(Language.SPANISH, "Buscar");
    searchLabel.put(Language.ENGLISH, "Search");
    searchLabel.put(Language.PORTUGESE, "Procurar");
    Entry search = new Entry(searchLabel);
    this.addEntry("Search", search);

    HashMap<Language, String> floorLabel = new HashMap<Language, String>();
    floorLabel = new HashMap<Language, String>();
    floorLabel.put(Language.SPANISH, "Piso");
    floorLabel.put(Language.ENGLISH, "Floor");
    floorLabel.put(Language.PORTUGESE, "Chão");
    Entry floor = new Entry(floorLabel);
    this.addEntry("Floor", floor);

    HashMap<Language, String> startLabel = new HashMap<Language, String>();
    startLabel = new HashMap<Language, String>();
    startLabel.put(Language.SPANISH, "Comienzo");
    startLabel.put(Language.ENGLISH, "Start");
    startLabel.put(Language.PORTUGESE, "Começar");
    Entry start = new Entry(startLabel);
    this.addEntry("Start", start);

    HashMap<Language, String> endLabel = new HashMap<Language, String>();
    endLabel = new HashMap<Language, String>();
    endLabel.put(Language.SPANISH, "Fin");
    endLabel.put(Language.ENGLISH, "End");
    endLabel.put(Language.PORTUGESE, "Fim");
    Entry end = new Entry(endLabel);
    this.addEntry("End", end);

    HashMap<Language, String> zoomLabel = new HashMap<Language, String>();
    zoomLabel = new HashMap<Language, String>();
    zoomLabel.put(Language.SPANISH, "Zoom");
    zoomLabel.put(Language.ENGLISH, "Zoom");
    zoomLabel.put(Language.PORTUGESE, "Zoom");
    Entry zoom = new Entry(zoomLabel);
    this.addEntry("Zoom", zoom);

    HashMap<Language, String> selectedLabel = new HashMap<Language, String>();
    selectedLabel = new HashMap<Language, String>();
    selectedLabel.put(Language.SPANISH, "Seleccionado");
    selectedLabel.put(Language.ENGLISH, "Selected");
    selectedLabel.put(Language.PORTUGESE, "Seleccionado");
    Entry selected = new Entry(searchLabel);
    this.addEntry("Selected", selected);

    HashMap<Language, String> goLabel = new HashMap<Language, String>();
    goLabel = new HashMap<Language, String>();
    goLabel.put(Language.SPANISH, "Ir a");
    goLabel.put(Language.ENGLISH, "Go");
    goLabel.put(Language.PORTUGESE, "Go");
    Entry go = new Entry(goLabel);
    this.addEntry("Go", go);

    HashMap<Language, String> doneLabel = new HashMap<Language, String>();
    doneLabel = new HashMap<Language, String>();
    doneLabel.put(Language.SPANISH, "Finalizar");
    doneLabel.put(Language.ENGLISH, "Done");
    doneLabel.put(Language.PORTUGESE, "Concluído");
    Entry done = new Entry(doneLabel);
    this.addEntry("Done", done);

    HashMap<Language, String> showOnMapLabel = new HashMap<Language, String>();
    showOnMapLabel = new HashMap<Language, String>();
    showOnMapLabel.put(Language.SPANISH, "Mostrar en el mapa");
    showOnMapLabel.put(Language.ENGLISH, "Show on Map");
    showOnMapLabel.put(Language.PORTUGESE, "Mostrar no mapa");
    Entry showOnMap = new Entry(showOnMapLabel);
    this.addEntry("Show on Map", showOnMap);

    HashMap<Language, String> n = new HashMap<Language, String>();
    n = new HashMap<Language, String>();
    n.put(Language.SPANISH, "Ver información");
    n.put(Language.ENGLISH, "View Info");
    n.put(Language.PORTUGESE, "Ver informações");
    Entry viewInfo = new Entry(n);
    this.addEntry("View Info", viewInfo);

    HashMap<Language, String> logOffLabel = new HashMap<Language, String>();
    logOffLabel = new HashMap<Language, String>();
    logOffLabel.put(Language.SPANISH, "Cerrar sesión");
    logOffLabel.put(Language.ENGLISH, "Log off");
    logOffLabel.put(Language.PORTUGESE, "Terminar sessão");
    Entry logOff = new Entry(logOffLabel);
    this.addEntry("Log off", logOff);

    HashMap<Language, String> editMapLabel = new HashMap<Language, String>();
    editMapLabel = new HashMap<Language, String>();
    editMapLabel.put(Language.SPANISH, "Editar Mapa");
    editMapLabel.put(Language.ENGLISH, "Edit Map");
    editMapLabel.put(Language.PORTUGESE, "Editar Mapa");
    Entry editMap = new Entry(editMapLabel);
    this.addEntry("Edit Map", editMap);

    HashMap<Language, String> createLabel = new HashMap<Language, String>();
    createLabel = new HashMap<Language, String>();
    createLabel.put(Language.SPANISH, "Crear");
    createLabel.put(Language.ENGLISH, "Create");
    createLabel.put(Language.PORTUGESE, "Criar");
    Entry create = new Entry(createLabel);
    this.addEntry("Create", create);

    HashMap<Language, String> deleteLabel = new HashMap<Language, String>();
    deleteLabel = new HashMap<Language, String>();
    deleteLabel.put(Language.SPANISH, "Eliminar");
    deleteLabel.put(Language.ENGLISH, "Delete");
    deleteLabel.put(Language.PORTUGESE, "Eliminar");
    Entry delete = new Entry(deleteLabel);
    this.addEntry("Delete", delete);

    HashMap<Language, String> saveLabel = new HashMap<Language, String>();
    saveLabel = new HashMap<Language, String>();
    saveLabel.put(Language.SPANISH, "Guardar");
    saveLabel.put(Language.ENGLISH, "Save");
    saveLabel.put(Language.PORTUGESE, "Guardar");
    Entry save = new Entry(saveLabel);
    this.addEntry("Save", save);

    HashMap<Language, String> cancelLabel = new HashMap<Language, String>();
    cancelLabel = new HashMap<Language, String>();
    cancelLabel.put(Language.SPANISH, "Cancelar");
    cancelLabel.put(Language.ENGLISH, "Cancel");
    cancelLabel.put(Language.PORTUGESE, "Cancelar");
    Entry cancel = new Entry(cancelLabel);
    this.addEntry("Cancel", cancel);

    HashMap<Language, String> searchDirectoryLabel = new HashMap<Language, String> ();
    searchDirectoryLabel = new HashMap<Language, String> ();
    searchDirectoryLabel.put(Language.SPANISH, "Buscar en directorio");
    searchDirectoryLabel.put(Language.ENGLISH, "Search Directory");
    searchDirectoryLabel.put(Language.PORTUGESE, "Diretório de Pesquisa");
    Entry searchDirectory = new Entry(searchDirectoryLabel);
    this.addEntry("Search Directory", searchDirectory);

    HashMap<Language, String> firstNameLabel = new HashMap<Language, String> ();
    firstNameLabel = new HashMap<Language, String> ();
    firstNameLabel.put(Language.SPANISH, "Nombre de pila");
    firstNameLabel.put(Language.ENGLISH, "First Name");
    firstNameLabel.put(Language.PORTUGESE, "Nome próprio");
    Entry firstName = new Entry(firstNameLabel);
    this.addEntry("First Name", firstName);

    HashMap<Language, String> lastNameLabel = new HashMap<Language, String> ();
    lastNameLabel = new HashMap<Language, String> ();
    lastNameLabel.put(Language.SPANISH, "Apellidos");
    lastNameLabel.put(Language.ENGLISH, "Last Name");
    lastNameLabel.put(Language.PORTUGESE, "Apelido");
    Entry lastName = new Entry(lastNameLabel);
    this.addEntry("Last Name", lastName);

    HashMap<Language, String> titleLabel = new HashMap<Language, String> ();
    titleLabel = new HashMap<Language, String> ();
    titleLabel.put(Language.SPANISH, "Puesto");
    titleLabel.put(Language.ENGLISH, "Title");
    titleLabel.put(Language.PORTUGESE, "Cargo");
    Entry title = new Entry(titleLabel);
    this.addEntry("Title", title);

    HashMap<Language, String> locationsLabel = new HashMap<Language, String> ();
    locationsLabel = new HashMap<Language, String> ();
    locationsLabel.put(Language.SPANISH, "Ubicaciónes");
    locationsLabel.put(Language.ENGLISH, "Locations");
    locationsLabel.put(Language.PORTUGESE, "Localizações");
    Entry locations = new Entry(locationsLabel);
    this.addEntry("Locations", locations);








  }

  /**
   * Adds a new HashMap to the org.Dictionary object.
   * @param string: Contains the string of the new HashMap.
   * @param entry: Contains the entry of the new HashMap.
   */
  public void addEntry(String string, Entry entry){
    this.stringEntryMap.put(string, entry);
  }

  /**
   * Gets a string from the given key. Returns an empty string if the key does not exist.
   * @param key: The key given to fetch the corresponding String.
   * @return: Returns the String associated with the key.
   */
  public String getString(String key, Language language){
    Entry info = stringEntryMap.get(key);
    if (info == null) {
      return "";
    }
    return info.getString(language);
  }

  public void setupDictionary () {
    stringEntryMap = new HashMap<String, Entry>();
    HashMap<Language, String> h = new HashMap<Language, String>();
    h.put(Language.SPANISH, "Espalda");
    h.put(Language.ENGLISH, "Back");
    h.put(Language.PORTUGESE, "Costas");
    Entry e = new Entry(h);
    this.addEntry("Back", e);


    HashMap<Language, String> s = new HashMap<Language, String>();
    s.put(Language.SPANISH, "Nombre de usuario");
    s.put(Language.ENGLISH, "Username");
    s.put(Language.PORTUGESE, "Nome de usuário");
    Entry g = new Entry(s);
    this.addEntry("Username", g);
  }
}
