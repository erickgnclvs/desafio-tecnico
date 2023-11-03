/*
 * An XML document type.
 * Localname: getComarcasMunicipios
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getComarcasMunicipios(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetComarcasMunicipiosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasMunicipiosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMARCASMUNICIPIOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcasMunicipios");
    
    
    /**
     * Gets the "getComarcasMunicipios" element
     */
    public br.jus.tjsc.www.selo.GetComarcasMunicipios getGetComarcasMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasMunicipios target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasMunicipios)get_store().find_element_user(GETCOMARCASMUNICIPIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getComarcasMunicipios" element
     */
    public void setGetComarcasMunicipios(br.jus.tjsc.www.selo.GetComarcasMunicipios getComarcasMunicipios)
    {
        generatedSetterHelperImpl(getComarcasMunicipios, GETCOMARCASMUNICIPIOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getComarcasMunicipios" element
     */
    public br.jus.tjsc.www.selo.GetComarcasMunicipios addNewGetComarcasMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasMunicipios target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasMunicipios)get_store().add_element_user(GETCOMARCASMUNICIPIOS$0);
            return target;
        }
    }
}
