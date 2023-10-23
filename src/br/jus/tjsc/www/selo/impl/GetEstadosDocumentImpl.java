/*
 * An XML document type.
 * Localname: getEstados
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEstados(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEstadosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESTADOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstados");
    
    
    /**
     * Gets the "getEstados" element
     */
    public br.jus.tjsc.www.selo.GetEstados getGetEstados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstados target = null;
            target = (br.jus.tjsc.www.selo.GetEstados)get_store().find_element_user(GETESTADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEstados" element
     */
    public void setGetEstados(br.jus.tjsc.www.selo.GetEstados getEstados)
    {
        generatedSetterHelperImpl(getEstados, GETESTADOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEstados" element
     */
    public br.jus.tjsc.www.selo.GetEstados addNewGetEstados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstados target = null;
            target = (br.jus.tjsc.www.selo.GetEstados)get_store().add_element_user(GETESTADOS$0);
            return target;
        }
    }
}
